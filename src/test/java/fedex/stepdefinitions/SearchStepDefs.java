package fedex.stepdefinitions;

import fedex.components.SearchResultsComponent;
import fedex.components.TrackingComponent;
import fedex.components.TrackingPossibilities;
import fedex.questions.Current;
import fedex.tasks.SearchFor;
import fedex.tasks.TrackPackage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class SearchStepDefs {
    @When("{actor} wants to find information about {string}")
    public void wantsToFindInformationAbout(Actor actor, String keyword) {
        actor.attemptsTo(
                SearchFor.keyword(keyword)
        );
    }

    @Then("{actor} should see information about {string}")
    public void shouldSeeInformationAbout(Actor actor, String keyword) {
        actor.attemptsTo(
                Ensure.that(SearchResultsComponent.SEARCH_INPUT).hasValue(keyword),
                Ensure.thatAmongst(SearchResultsComponent.SEARCH_RESULTS)
                        .anyMatch("contains keyword " + keyword,
                                result -> result.getText().toLowerCase().contains(keyword))
        );
    }

    @When("{actor} wants to find information about a package with {string} using {string}")
    public void wantsToFindInformationAboutPackageUsing(Actor actor, String trackingNumber, String component) {
        switch (TrackingPossibilities.byName(component)) {
            case SEARCH -> wantsToFindInformationAbout(actor, trackingNumber);
            case CUBE -> wantsToTrackPackageWith(actor, trackingNumber);
        }
    }

    @When("{actor} wants to track package with {string}")
    public void wantsToTrackPackageWith(Actor actor, String trackingNumber) {
        actor.attemptsTo(
                TrackPackage.with(trackingNumber)
        );
    }

    @Then("{actor} should see information about existing package with {string}")
    public void shouldSeeInformationAboutExistingPackage(Actor actor, String trackingNumber) {
        actor.attemptsTo(
                Ensure.that(TrackingComponent.TRACKING_NUMBER
                        .waitingForNoMoreThan(Duration.ofSeconds(5))).isDisplayed(),
                Ensure.that(TrackingComponent.TRACKING_NUMBER).hasText(trackingNumber),
                Ensure.that(TrackingComponent.STATUS).hasTrimmedTextContent("On Time")
        );
    }

    @Then("{actor} should be informed about no record of {string}")
    public void shouldBeInformedAboutNoRecordOf(Actor actor, String trackingNumber) {
        assertThat(Current.url().answeredBy(actor), containsString(trackingNumber));
        actor.attemptsTo(
                Ensure.that(TrackingComponent.ERROR).isDisplayed(),
                Ensure.that(TrackingComponent.ERROR)
                        .text()
                        .containsIgnoringCase("No record of this tracking number can be found at this time")
        );
    }

    @And("{actor} should be able to contact customer service with one click")
    public void shouldBeAbleToContactCustomerServiceWithOneClick(Actor actor) {
        actor.attemptsTo(
                Ensure.that(TrackingComponent.CUSTOMER_SERVICE)
                        .isDisplayed(),
                Ensure.that(TrackingComponent.CUSTOMER_SERVICE)
                        .attribute("href")
                        .isEqualTo("/en-gb/customer-support.html")
        );
    }

    @And("{actor} should see no results found for {string}")
    public void shouldSeeNoResultsFoundFor(Actor actor, String trackingNumber) {
        actor.attemptsTo(
                Ensure.that(SearchResultsComponent.NO_RESULTS)
                        .attribute("outerText")
                        .hasValue()
                        .contains(trackingNumber)
        );
    }
}

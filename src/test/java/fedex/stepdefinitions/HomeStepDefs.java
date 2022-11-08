package fedex.stepdefinitions;

import fedex.components.HeaderComponent;
import fedex.components.SearchComponent;
import fedex.tasks.AcceptCookies;
import fedex.tasks.BrowseTo;
import fedex.tasks.ChooseLanguage;
import fedex.tasks.NavigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class HomeStepDefs {
    @Given("{actor} is on FedEx homepage")
    public void isOnHomePage(Actor actor) {
        actor.attemptsTo(
                NavigateTo.theHomePage()
                        .then(ChooseLanguage.english())
                        .then(AcceptCookies.all())
        );
    }

    @Given("{actor} chooses English language")
    public void choosesEnglish(Actor actor) {
        actor.attemptsTo(
                NavigateTo.theHomePage()
                        .then(ChooseLanguage.english())
        );
    }

    @Given("{actor} accepts all cookies")
    public void acceptsCookies(Actor actor) {
        actor.attemptsTo(AcceptCookies.all()
        );
    }

    @And("{actor} wants to get information from customer support")
    public void wantsToFindANearestFedExLocation(Actor actor) {
        actor.attemptsTo(
                BrowseTo.theContactUsPage()
        );
    }

    @Then("{actor} should be able to see FedEx logo")
    public void shouldBeAbleToSeeFedExLogo(Actor actor) {
        actor.attemptsTo(
                Ensure.that(HeaderComponent.LOGO).isDisplayed(),
                Ensure.that(HeaderComponent.LOGO)
                        .attribute("src")
                        .containsIgnoringCase("logo.png")
        );
    }

    @And("{actor} should be able to browse the site using top menu")
    public void shouldBeAbleToBrowseTheSiteUsingTopMenu(Actor actor) {
        actor.attemptsTo(
                Ensure.that(HeaderComponent.MENU).isDisplayed(),
                Ensure.that(HeaderComponent.MENU).containsElements(".dropdown")
        );
    }

    @And("{actor} should be able to login or sign up")
    public void shouldBeAbleToLoginOrSignUp(Actor actor) {
        actor.attemptsTo(
                Ensure.that(HeaderComponent.SIGN_IN).isDisplayed()
        );
    }

    @And("{actor} should be able to perform search")
    public void shouldBeAbleToPerformSearch(Actor actor) {
        actor.attemptsTo(
                Ensure.that(SearchComponent.SEARCH_ICON).isDisplayed()
        );
    }
}

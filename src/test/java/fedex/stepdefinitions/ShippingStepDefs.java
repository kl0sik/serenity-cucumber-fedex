package fedex.stepdefinitions;

import fedex.components.QuotationComponent;
import fedex.components.ShipmentComponent;
import fedex.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.time.Duration;

public class ShippingStepDefs {
    @When("{actor} wants to find out the cost of shipping from {string} to {string}")
    public void jakeWantsToFindOutTheCostOfShippingFromTo(Actor actor, String from, String to) {
        actor.attemptsTo(
                ProvideOriginAndDestination.forShipping(from, to)
        );
        actor.remember("Origin City", from);
    }

    @And("{actor} has {string} {string} package which weighs {string} kg")
    public void hasPackageWhichWeighs(Actor actor, String qty, String packageType, String weight) {
        actor.attemptsTo(
                ProvidePackageDetails.forShipping(qty, packageType, weight)
        );
    }

    @And("{actor} wants it shipped on the same day")
    public void wantsItShippedOnTheSameDay(Actor actor) {
        actor.attemptsTo(
                SetShipmentDate.forToday()
        );
    }

    @Then("{actor} should see available rates and delivery dates")
    public void shouldSeeAvailableRatesAndDeliveryDates(Actor actor) {
        actor.attemptsTo(
                ShowRates.forShipment()
                        .then(Ensure.that(QuotationComponent.RATES.waitingForNoMoreThan(Duration.ofSeconds(10)))
                                .isDisplayed())
        );
    }

    @And("{actor} should be able to ship now")
    public void shouldBeAbleToShipNow(Actor actor) {
        actor.attemptsTo(
                Ship.now()
                        .then(Ensure.that(ShipmentComponent.MANAGER_HEADER)
                                .text()
                                .containsIgnoringCase("FedEx Ship Manager"))
                        .then(Ensure.that(ShipmentComponent.FROM_CITY)
                                .hasValue(actor.recall("Origin City")))
        );
    }
}

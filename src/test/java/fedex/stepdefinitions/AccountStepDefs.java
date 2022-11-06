package fedex.stepdefinitions;

import fedex.components.LogInComponent;
import fedex.tasks.BrowseTo;
import fedex.tasks.LogIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class AccountStepDefs {
    @Given("{actor} wants to log in")
    public void wantsToLogIn(Actor actor) {
        actor.wasAbleTo(
                BrowseTo.theLogInPage()
        );
    }

    @When("{actor} provides incorrect credentials")
    public void providesIncorrectCredentials(Actor actor) {
        actor.attemptsTo(
                LogIn.withCredentials("badId", "badPass")
        );
    }

    @Then("{actor} should not be able to log in")
    public void shouldNotBeAbleToLogIn(Actor actor) {
        actor.attemptsTo(
                Ensure.that(
                        LogInComponent.ERROR).isDisplayed()
        );
    }

    @Then("{actor} should see error message containing {string}")
    public void shouldSeeErrorMessageContaining(Actor actor, String text) {
        actor.attemptsTo(
                Ensure.that(
                                LogInComponent.ERROR)
                        .text()
                        .containsIgnoringCase(text)
        );
    }
}

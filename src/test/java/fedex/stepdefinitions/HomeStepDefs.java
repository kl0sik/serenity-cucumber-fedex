package fedex.stepdefinitions;

import fedex.tasks.AcceptCookies;
import fedex.tasks.BrowseTo;
import fedex.tasks.ChooseLanguage;
import fedex.tasks.NavigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;

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
}

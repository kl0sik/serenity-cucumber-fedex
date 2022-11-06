package fedex.stepdefinitions;

import fedex.components.VirtualAssistantComponent;
import fedex.tasks.QueryVirtualAssistant;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;


public class CustomerSupportStepDefs {
    @When("{actor} queries Virtual Support Assistant for {string}")
    public void queriesVirtualSupportAssistant(Actor actor, String query) {
        actor.attemptsTo(
                QueryVirtualAssistant.with(query)
        );
    }

    @Then("{actor} should receive an answer related to {string}")
    public void shouldReceiveAnAnswerRelatedTo(Actor actor, String query) {
        actor.wasAbleTo(
                Ensure.that(VirtualAssistantComponent.CONVERSATION)
                        .text()
                        .containsIgnoringCase(query)
        );
    }
}

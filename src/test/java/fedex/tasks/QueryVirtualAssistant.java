package fedex.tasks;

import fedex.components.VirtualAssistantComponent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class QueryVirtualAssistant {
    public static Performable with(String text) {
        return Task.where("{0} queries Virtual Assistant",
                Enter.theValue(text)
                        .into(VirtualAssistantComponent.INPUT)
                        .then(Click.on(VirtualAssistantComponent.SUBMIT))
        );
    }
}

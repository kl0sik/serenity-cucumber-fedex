package fedex.tasks;

import fedex.components.QuotationComponent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Ship {
    public static Performable now() {
        return Task.where("{0} submits the whole form",
                WaitUntil.the(QuotationComponent.SHIP_NOW, WebElementStateMatchers.isEnabled())
                        .then(Click.on(QuotationComponent.SHIP_NOW))
        );
    }
}

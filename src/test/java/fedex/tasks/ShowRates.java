package fedex.tasks;

import fedex.components.QuotationComponent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ShowRates {
    public static Performable forShipment() {
        return Task.where("{0} submits the form",
                WaitUntil.the(QuotationComponent.SHOW_RATES, WebElementStateMatchers.isEnabled())
                        .then(Click.on(QuotationComponent.SHOW_RATES))
        );
    }
}

package fedex.tasks;

import fedex.components.HeaderComponent;
import fedex.components.QuotationComponent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class BrowseTo {
    public static Performable theLogInPage() {
        return Task.where("{0} browses to LogIn page",
                Click.on(HeaderComponent.SIGN_IN)
                        .then(Click.on(HeaderComponent.LOG_IN))
        );
    }

    public static Performable rateAndTransitTimes() {
        return Task.where("{0} browses to Rate and Transit times calculator",
                Click.on(QuotationComponent.QUOTATION)
        );
    }

    public static Performable theContactUsPage() {
        return Task.where("{0} browses to Contact Us page",
                Click.on(HeaderComponent.SUPPORT)
                        .then(Click.on(HeaderComponent.CONTACT_US))
        );
    }
}

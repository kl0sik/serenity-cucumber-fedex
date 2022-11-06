package fedex.tasks;

import fedex.pages.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AcceptCookies {
    public static Performable all() {
        return Task.where("{0} accepts all cookies",
                Click.on(HomePage.ACCEPT_COOKIES)
        );
    }
}

package fedex.tasks;

import fedex.components.LogInComponent;
import fedex.pages.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theHomePage() {
        return Task.where("{0} opens Homepage",
                Open.browserOn().the(HomePage.class));
    }

    public static Performable theLogInPage() {
        return Task.where("{0} opens LogIn page",
                Open.browserOn().the(LogInComponent.class));
    }

    public static Performable page(String pageName) {
        return Task.where("{0} opens page named",
                Open.browserOn().thePageNamed(pageName));
    }
}

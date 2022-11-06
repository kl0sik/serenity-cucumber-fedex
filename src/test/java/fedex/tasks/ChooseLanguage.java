package fedex.tasks;

import fedex.pages.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ChooseLanguage {
    public static Performable english() {
        return Task.where("{0} chooses English language",
                Click.on(HomePage.UK_ENGLISH)
        );
    }
}

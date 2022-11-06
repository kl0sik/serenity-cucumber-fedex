package fedex.tasks;

import fedex.components.LogInComponent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class LogIn {
    public static Performable withCredentials(String id, String pass) {
        return Task.where("{0} logs in with " + id + " and " + pass,
                Enter.theValue(id)
                        .into(LogInComponent.ID)
                        .then(Enter.theValue(pass)
                                .into(LogInComponent.PASS)
                                .thenHit(Keys.ENTER))
        );
    }
}

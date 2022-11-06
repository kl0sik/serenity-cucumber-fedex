package fedex.components;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.fedex.com/secure-login/en-gb/#")
public class LogInComponent extends HeaderComponent {
    public static Target ID = Target
            .the("User id input field")
            .locatedBy("#userId");

    public static Target PASS = Target
            .the("User pass input field")
            .locatedBy("#password");

    public static Target SUBMIT = Target
            .the("Log In button")
            .locatedBy("#login-btn");

    public static Target ERROR = Target
            .the("Invalid credentials error message")
            .locatedBy("#invalidCredentials");
}



package fedex.components;

import fedex.pages.HomePage;
import net.serenitybdd.screenplay.targets.Target;

public class HeaderComponent extends HomePage {
    public static Target SIGN_IN = Target
            .the("Sign up / Log In drop-down")
            .locatedBy("#fxg-dropdown-signIn");

    public static Target LOG_IN = Target
            .the("Log In link")
            .locatedBy("//a[@title='Log In']");

    public static Target BUTTON_WITH_LABEL = Target
            .the("{0} button")
            .locatedBy("//a[@aria-label='{0}']");

    public static Target SUPPORT = BUTTON_WITH_LABEL.of("Support");

    public static Target CONTACT_US = BUTTON_WITH_LABEL.of("Contact Us");
}

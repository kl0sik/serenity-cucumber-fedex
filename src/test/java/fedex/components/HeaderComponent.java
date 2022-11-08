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

    public static Target LINK_WITH_LABEL = Target
            .the("{0} link")
            .locatedBy("//a[@aria-label='{0}']");

    public static Target SUPPORT = LINK_WITH_LABEL.of("Support");

    public static Target CONTACT_US = LINK_WITH_LABEL.of("Contact Us");

    public static Target HEADER = Target
            .the("Header")
            .locatedBy("//nav");

    public static Target LOGO = Target
            .the("FedEx logo")
            .locatedBy("//img")
            .inside(HEADER);

    public static Target MENU = Target
            .the("Menu")
            .locatedBy(".fxg-global-nav")
            .inside(HEADER);
}

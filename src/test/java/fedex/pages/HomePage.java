package fedex.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.fedex.com/en-gb/home.html")
public class HomePage extends PageObject {
    public static Target UK_ENGLISH = Target
            .the("Language pop up")
            .locatedBy("//a[@data-country-code='gb']");

    public static Target ACCEPT_COOKIES = Target
            .the("Cookies button")
            .locatedBy("//fedex-cookie-consent//button")
            .containingTextIgnoringCase("accept");
}

package fedex.components;

import fedex.pages.HomePage;
import net.serenitybdd.screenplay.targets.Target;

public class QuotationComponent extends HomePage {
    public static Target QUOTATION = Target
            .the("Quotation cube")
            .locatedBy("#cubeOnePar");

    public static Target FROM = Target
            .the("Origin city")
            .locatedBy("#fromGoogleAddress");

    public static Target SUGGESTIONS = Target
            .the("Suggestions")
            .locatedBy("//ul[@id='e2eGoogleAddressSuggestionList']");

    public static Target FIRST_SUGGESTION = Target
            .the("First suggestion")
            .locatedBy("//ul[@id='e2eGoogleAddressSuggestionList']//li[1]");

    public static Target TO = Target
            .the("Destination city")
            .locatedBy("#toGoogleAddress");

    public static Target SPINNER = Target
            .the("Loading indicator spinner")
            .locatedBy("fdx-loading-indicator-spinner");

    public static Target PACKAGE_TYPE = Target
            .the("Package type")
            .locatedBy("#package-details__package-type");

    public static Target PACKAGE_QTY = Target
            .the("Package quantity")
            .locatedBy("#package-details__quantity-0");

    public static Target PACKAGE_WEIGHT = Target
            .the("Package weight")
            .locatedBy("#package-details__weight-0");

    public static Target PACKAGE_SHIP_DATE = Target
            .the("Package quantity")
            .locatedBy("#packageShipDate");

    public static Target SHOW_RATES = Target
            .the("Show rates button")
            .locatedBy("#e2ePackageDetailsSubmitButtonRates");

    public static Target RATES = Target
            .the("List of available rates")
            .locatedBy("//magr-rate-list");

    public static Target SHIP_NOW = Target
            .the("Ship now button")
            .locatedBy("//magr-rate-list//button[contains(text(), 'now')]");
}



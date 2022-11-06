package fedex.tasks;

import fedex.components.QuotationComponent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ProvidePackageDetails {
    public static Performable forShipping(String qty, String packageType, String weight) {
        return Task.where("{0} selects a " + packageType + " that weighs: " + weight + " kg",
                WaitUntil.the(QuotationComponent.SPINNER, WebElementStateMatchers.isNotVisible())
                        .then(SelectFromOptions.byValue(packageType).from(QuotationComponent.PACKAGE_TYPE))
                        .then(SelectFromOptions.byVisibleText(qty).from(QuotationComponent.PACKAGE_QTY))
                        .then(Enter.theValue(weight).into(QuotationComponent.PACKAGE_WEIGHT))
        );
    }
}

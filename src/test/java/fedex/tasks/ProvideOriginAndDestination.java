package fedex.tasks;

import fedex.components.QuotationComponent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ProvideOriginAndDestination {
    public static Performable forShipping(String from, String to) {
        return Task.where("{0} inputs origin: " + from + " and destination: " + to,
                Click.on(QuotationComponent.QUOTATION)
                        .then(WaitUntil.the(QuotationComponent.FROM, isVisible())
                                .forNoMoreThan(10).seconds())
                        .then(enterValueWaitForSuggestionsAndSelectFirst(from, QuotationComponent.FROM))
                        .then(enterValueWaitForSuggestionsAndSelectFirst(to, QuotationComponent.TO))
        );
    }

    private static Performable enterValueWaitForSuggestionsAndSelectFirst(String value, Target element) {
        return Enter.theValue(value).into(element)
                .then(WaitUntil.the(QuotationComponent.SPINNER, isNotCurrentlyVisible()))
                .then(WaitUntil.the(QuotationComponent.SUGGESTIONS, isCurrentlyVisible()))
                .then(Click.on(QuotationComponent.FIRST_SUGGESTION))
                .then(WaitUntil.the(QuotationComponent.SPINNER, isNotCurrentlyVisible()));
    }
}

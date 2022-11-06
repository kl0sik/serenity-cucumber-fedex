package fedex.tasks;

import fedex.components.SearchComponent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchFor {
    public static Performable keyword(String keyword) {
        return Task.where("{0} searches for " + keyword,
                Click.on(SearchComponent.SEARCH_ICON)
                        .then(Enter.theValue(keyword).into(SearchComponent.SEARCH_INPUT))
                        .then(Click.on(SearchComponent.SUBMIT_SEARCH))
        );
    }
}

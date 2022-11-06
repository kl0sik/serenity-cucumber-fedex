package fedex.components;

import net.serenitybdd.screenplay.targets.Target;

public class SearchResultsComponent extends HeaderComponent {
    public static Target SEARCH_INPUT = Target
            .the("Search input")
            .locatedBy("//div[@class='magic-box-input']//input");

    public static Target SEARCH_RESULTS = Target
            .the("Search results")
            .locatedBy("//div[@class='coveo-result-frame']");

    public static Target NO_RESULTS = Target
            .the("No results found for")
            .locatedBy("//span[@class='coveo-highlight']");
}

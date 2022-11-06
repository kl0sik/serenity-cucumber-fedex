package fedex.components;

import net.serenitybdd.screenplay.targets.Target;

public class SearchComponent extends HeaderComponent {
    public static Target SEARCH_ICON = Target
            .the("Search icon")
            .locatedBy("//a[@class='fxg-keyboard']");

    public static Target SEARCH_INPUT = Target
            .the("Search input")
            .locatedBy("#fxg-search-text");

    public static Target SUBMIT_SEARCH = Target
            .the("Search icon submit")
            .locatedBy("#fxg-search-icon");
}

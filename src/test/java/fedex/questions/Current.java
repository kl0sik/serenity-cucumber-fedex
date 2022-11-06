package fedex.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Current {
    public static Question<String> url() {
        return Question.about("{0} gets current url")
                .answeredBy(actor -> BrowseTheWeb.as(actor).getDriver().getCurrentUrl());
    }
}

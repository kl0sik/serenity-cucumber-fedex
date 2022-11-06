package fedex.components;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.screenplay.targets.Target;

public class VirtualAssistantComponent extends PageComponent {
    public static Target INPUT = Target
            .the("Virtual Assistant input field")
            .locatedBy("//textarea");

    public static Target SUBMIT = Target
            .the("Virtual Assistant submit button")
            .locatedBy("//div[contains(@class, 'nw_UserSubmit')]");

    public static Target CONVERSATION = Target
            .the("Conversation text")
            .locatedBy("//div[@class='nw_ConversationText']");
}

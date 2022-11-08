package fedex.components;

import net.serenitybdd.screenplay.targets.Target;

public class TrackingComponent extends HeaderComponent {
    public static Target HEADING = Target
            .the("Heading")
            .locatedBy("#menuTitle");

    public static Target TRACKING_NUMBER = Target
            .the("Tracking number")
            .locatedBy("#shipmentIdentifier");

    public static Target STATUS = Target
            .the("Package status")
            .locatedBy("#packageServicePillNew");

    public static Target ERROR = Target
            .the("Error message")
            .locatedBy("//span[@class='systemErrorMessageTop']");

    public static Target CUSTOMER_SERVICE = Target
            .the("Customer service link")
            .locatedBy("a")
            .inside(ERROR);

    public static Target INPUT = Target
            .the("Tracking input field")
            .locatedBy("#trackingnumber");

    public static Target TRACK = Target
            .the("Track submit button")
            .locatedBy("#btnSingleTrack");
}

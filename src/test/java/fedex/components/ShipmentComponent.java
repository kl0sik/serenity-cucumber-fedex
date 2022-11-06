package fedex.components;

import fedex.pages.HomePage;
import net.serenitybdd.screenplay.targets.Target;

public class ShipmentComponent extends HomePage {
    public static Target MANAGER_HEADER = Target
            .the("FedEx Ship Manager Lite header")
            .locatedBy("#fx-appNav");

    public static Target FROM_CITY = Target
            .the("From City form field")
            .locatedBy("#fx-from-city");
}

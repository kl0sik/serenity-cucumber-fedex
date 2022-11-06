package fedex.tasks;

import fedex.components.TrackingComponent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TrackPackage {
    public static Performable with(String trackingNumber) {
        return Task.where("{0} tracks package with " + trackingNumber,
                Enter.theValue(trackingNumber)
                        .into(TrackingComponent.INPUT)
                        .then(Click.on(TrackingComponent.TRACK))
        );
    }
}
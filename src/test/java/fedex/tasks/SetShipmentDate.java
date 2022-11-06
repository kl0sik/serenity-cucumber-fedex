package fedex.tasks;

import fedex.components.QuotationComponent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SetShipmentDate {
    public static Performable forToday() {
        return Task.where("{0} sets shipment date for today",
                SelectFromOptions.byValue(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE))
                        .from(QuotationComponent.PACKAGE_SHIP_DATE)
        );
    }
}

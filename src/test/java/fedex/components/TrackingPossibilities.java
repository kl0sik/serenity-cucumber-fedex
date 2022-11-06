package fedex.components;

import java.util.Arrays;

public enum TrackingPossibilities {
    SEARCH("Search Component in Header"),
    CUBE("Cube Component on Homepage");

    TrackingPossibilities(String componentName) {
        this.componentName = componentName;
    }

    private final String componentName;

    public String getComponentName() {
        return componentName;
    }

    public static TrackingPossibilities byName(String componentName) {
        return Arrays.stream(values())
                .filter(component -> component
                        .getComponentName()
                        .equalsIgnoreCase(componentName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(componentName + " not found"));
    }
}

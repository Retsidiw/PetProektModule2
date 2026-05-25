public enum Temperature {
    CELSIUS(1),
    FAHRENHEIT(33.8),
    KELVIN(274.15);
    private final double value;

    Temperature (double value) {
        this.value = value;
    }
}

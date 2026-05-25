public enum Length {
    METERS(1),
    KILOMETERS(1000),
    MILES(1609.34);
    private final double value;

    Length (double value) {
        this.value = value;
    }
}

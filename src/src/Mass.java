public enum Mass {
    KILOGRAMS(1),
    POUNDS(2.2),
    OUNCES(35.27);
    private final double value;

    Mass (double value){
        this.value = value;
    }
}

public enum Currency {
    DOLLAR_BILL(100),
    QUARTER(25),
    DIME(10),
    NICKEL(5);
    int value;

    private Currency(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }

}
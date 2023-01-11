package oop.showroom;

public enum FuelType {

    PB95("bezołowiowa 95"),
    PB98("bezwołowiowa 98"),
    DIESEL("olej napędowy");

    private final String description;

    FuelType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

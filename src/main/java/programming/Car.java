package programming;

import lombok.Getter;

@Getter

public class Car extends Vehicle{

    private String brand;
    private String model;
    private int yearOfProd;
    private Gearbox gearbox;
    private int seatsNumber;
    private Fuel fuel;
    private int engineCapacity;

    public Car(String brand, String model, int yearOfProd, Gearbox gearbox, int seatsNumber, Fuel fuel, int engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.yearOfProd = yearOfProd;
        this.gearbox = gearbox;
        this.seatsNumber = seatsNumber;
        this.fuel = fuel;
        this.engineCapacity = engineCapacity;
    }

    public Car(String brand, String model, int yearOfProd, Gearbox gearbox, int seatsNumber, String fuel, int engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.yearOfProd = yearOfProd;
        this.gearbox = gearbox;
        this.seatsNumber = seatsNumber;
        this.fuel = Fuel.findByOriginalName(fuel);
        this.engineCapacity = engineCapacity;
    }
}

package oop.showroom;

public class Main {
    public static void main(String[] args) {
        Vehicle audi = new Car(BrandType.AUDI, ModelType.A4, ColorType.RED, EngineType.V8, 10000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "car-drive", 5,
                200, 6);
        Vehicle bmw = new Motorbike(BrandType.BMW, ModelType.X6, ColorType.RED, EngineType.V8, 50050,
                GearboxType.AUTOMATIC, true, MotorbikeType.CHOPPER);

        System.out.println(audi);
    }
}

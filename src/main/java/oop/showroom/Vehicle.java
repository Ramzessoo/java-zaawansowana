package oop.showroom;

import lombok.ToString;

@ToString
public abstract class Vehicle {
    private BrandType brand;
    private ModelType model;
    private ColorType colour;
    private EngineType engine;
    private double mileage;
    private GearboxType gearboxType;
    private boolean isUsed;

    public Vehicle(){

    }


    public Vehicle(BrandType brand, ModelType model, ColorType colour, EngineType engine, double mileage,
                   GearboxType gearboxType, boolean isUsed) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.engine = engine;
        this.mileage = mileage;
        this.gearboxType = gearboxType;
        this.isUsed = isUsed;
    }

    abstract Object getSimpleVehicle();

    public BrandType getBrand() {
        return brand;
    }

    public void setBrand(BrandType brand) {
        this.brand = brand;
    }

    public ModelType getModel() {
        return model;
    }

    public void setModel(ModelType model) {
        this.model = model;
    }

    public ColorType getColour() {
        return colour;
    }

    public void setColour(ColorType colour) {
        this.colour = colour;
    }

    public EngineType getEngine() {
        return engine;
    }

    public void setEngine(EngineType engine) {
        this.engine = engine;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = gearboxType;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}

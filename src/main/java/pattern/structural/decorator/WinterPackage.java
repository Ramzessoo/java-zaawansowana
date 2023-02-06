package pattern.structural.decorator;

public class WinterPackage extends CarDecorator {
    private boolean electricMirrors;
    private boolean heatedSeats;

    public WinterPackage(Car car, boolean electricMirrors, boolean heatedSeats) {
        super(car);
        this.electricMirrors = electricMirrors;
        this.heatedSeats = heatedSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding winter features " + (electricMirrors ? "with heated mirrors" : "") + (heatedSeats ? "with heated seats" : ""));

    }
}

package pattern.creational.abstractFactory;

public class FordOrderPoint {
    public static Ford orderYourDreamedFord(FordFactory factory) {
        System.out.println("Zamawiwmy nowego Forda");
        return factory.createFord();
    }
}

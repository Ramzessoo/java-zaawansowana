package pattern.structural.decorator;

public class DecoratorDemoApp {
    public static void main(String[] args) {
        System.out.println("Zwykły prosty samochód bez dodatków: ");
        Car basicCar = new BasicCar();
        basicCar.assemble();
        System.out.println("\n=================================");
        System.out.println("====================================\n");
        Car basicCar2 = new BasicCar();
        SportPackage sportPackage = new SportPackage(basicCar2, true, false);
        sportPackage.assemble();
        System.out.println("\n=====================================");
        System.out.println("=========================================\n");
        System.out.println("Samochod sportowy z zimowym wyposażeniem");
        Car basicCar3 = new BasicCar();
        SportPackage sportPackage1 = new SportPackage(basicCar3, true, true);
        WinterPackage winterPackage = new WinterPackage(sportPackage1, true, true);
        System.out.println("\n======================================");
        System.out.println("=========================================\n");
        System.out.println("Samochód z zimowym pakietem i sportowym charakterem");
        SportPackage full = new SportPackage(new WinterPackage(new BasicCar(), true, true), true, true);
        full.assemble();
        /**
         * na testach (może pojawić się ta ostatnia postać z pytaniem co to za wzorzec:
         * new A(new B(New C))
         * */
    }
}

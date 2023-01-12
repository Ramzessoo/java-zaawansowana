package oop.showroom;

import oop.showroom.model.Car;
import oop.showroom.model.Motorbike;
import oop.showroom.model.Vehicle;
import oop.showroom.model.enums.*;
import oop.showroom.service.VehicleService;
import oop.showroom.service.VehicleServiceImpl;

import java.util.Scanner;

public class ShowroomApp {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        ShowroomApp showroomApp = new ShowroomApp();
        showroomApp.run();
    }

    private void run() throws InterruptedException {
        VehicleService vehicleService = new VehicleServiceImpl();
        init(vehicleService);

        boolean on = true;
        Thread.sleep(1000);
        while (on) {
            showMenu();
            System.out.println("Wpisz odpowiednią liczbę: ");
            int decision = SCANNER.nextInt();
            switch (decision) {
                case 1 -> addCar(vehicleService);
                case 2 -> addMotorbike(vehicleService);
                case 3 -> showVehicles(vehicleService);
                case 0 -> {
                    on = false;
                    System.out.println("Do widzenia!");
                }
                default -> System.out.println("nie ma operacji o takim numerze");
            }
        }
    }

    private void showMenu() {
        System.out.println("Witaj w aplikacji salonu pojazdów!");
        System.out.println("Jaką operację chcesz wykonać?");
        System.out.println("1 - dodaj nowy samochód");
        System.out.println("2 - dodaj nowy motocykl");
        System.out.println("3 - wyświetl wszystkie pojazdy");
        System.out.println("0 - zakończ program");
    }

    private void addCar(VehicleService vehicleService) {
        Car car = new Car();
        System.out.println("Wpisz markę samochodu: BMW, AUDI, CITROEN");
        String brand = SCANNER.next();
        car.setBrand(BrandType.valueOf(brand));
        System.out.println("podaj liczbę drzwi: ");
        int doorsNumber = SCANNER.nextInt();
        car.setDoorsNumber(doorsNumber);
        vehicleService.addVehicle(car);
        System.out.println("dodano samochód");
    }

    private void addMotorbike(VehicleService vehicleService) {
        Motorbike motorbike = new Motorbike();
        System.out.println("Wpisz markę motocykla: BMW, AUDI, CITROEN");
        String motorBrand = SCANNER.next();
        motorbike.setBrand(BrandType.valueOf(motorBrand));
        System.out.println("Podaj typ motocykla: CHOPPER, EDNURO");
        String motorbykeType = SCANNER.next();
        motorbike.setMotorbikeType(MotorbikeType.valueOf(motorbykeType));
        vehicleService.addVehicle(motorbike);
        System.out.println("dodano motocykl");
    }

    private void showVehicles(VehicleService vehicleService) {
        System.out.println("Lista wszystkich pojazdów:");
        for (Vehicle vehicle : vehicleService.getAllVehicles()) {
            System.out.println(vehicle);
        }
    }

    private void init(VehicleService vehicleService) {
        Car audi = new Car(BrandType.AUDI, ModelType.A4, ColourType.RED, EngineType.V8, 10000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "car-drive", 5,
                200, 5);

        Motorbike bmw = new Motorbike(BrandType.BMW, ModelType.X6, ColourType.GREEN, EngineType.V8, 50000,
                GearboxType.AUTOMATIC, true, MotorbikeType.CHOPPER, "łańcuch");


        vehicleService.addVehicle(audi);
        vehicleService.addVehicle(bmw);
    }
}

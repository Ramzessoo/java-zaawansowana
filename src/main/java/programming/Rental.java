package programming;

import lombok.Getter;
import programming.people.Person;

import java.time.LocalDate;

@Getter

public class Rental {

        Vehicle car1 = new Car("Renault", "308", 2016, Gearbox.MANUAL, 5, "Diesel", 1997);
        Vehicle car2 = new Car("BMW", "320d", 2019, Gearbox.AUTOMATIC, 5, "Benzyna", 2000);
        Vehicle car3 = new Car("Volkswagen", "Passat", 2008, Gearbox.MANUAL, 5, "Gaz", 1600);
        Vehicle car4 = new Car("Ford", "Transit", 2022, Gearbox.MANUAL, 3, "Diesel", 1897);
        Vehicle car5 = new Car("Volvo", "XC60", 2020, Gearbox.AUTOMATIC, 5, "95", 2497);
        Vehicle car6 = new Car("Fiat", "500", 2019, Gearbox.MANUAL, 4, "ON", 1400);
        Vehicle car7 = new Car("KIA", "Ceed", 2022, Gearbox.AUTOMATIC, 5, Fuel.PB, 2700);

        LocalDate rentDate;
        LocalDate expectedReturnDate;
        Double prise;
        Person person;

    public Rental(LocalDate rentDate, LocalDate expectedReturnDate, Double prise, Person person) {
        this.rentDate = rentDate;
        this.expectedReturnDate = expectedReturnDate;
        this.prise = prise;
        this.person = person;
    }
}


package pattern.creational.singleton;

/**
 * Wzorzec zakładający możliwość utowrzenia dokładnie jednego obiektu
 * danej klasy
 * Eager - czyli w momenicie uruchamiania programu, niezależnie czy
 * obiekt ma szanse być użyty czy nie
 */

public class EagerSingleton {

    public static final EagerSingleton INSTANCE = new EagerSingleton();

    private int counter;

    private EagerSingleton() {
        System.out.println("Prywatny konstruktor");
        counter = 0;
    }

    public static EagerSingleton getInstance() {
        System.out.println("Pobieramy obiekt");
        return INSTANCE;
    }

    public int getCounter() {
        return counter;
    }

    public int increment() {
        return counter++;
    }

    public int decrement() {
        return counter--;
    }

}

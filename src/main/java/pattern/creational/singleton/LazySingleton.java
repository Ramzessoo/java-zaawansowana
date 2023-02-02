package pattern.creational.singleton;

/**
 * LazySingleton czyli = od słowa Lazy - tworzymy przy pierwszej próbie użycia obiektu
 *
 * !!!LazySingleton nie może być używany w aplikacji wielowątkowej
 * */

public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton() {
        System.out.println("Kontruktor LazySingleton");
    }

    public static LazySingleton getInstance(){
        System.out.println("Pobieramy instancję LazySingleton");
       if (INSTANCE == null) {
           //dajmy na to że w tym miejscu 1 wątek zosta zatrzymany i uruchamia się drugi
           //na to drugi przeleci cały program, wygeneruje nową instancję
           //potem pierwszy się ponownie budzi i kończy działanie = robi sout() i nowy obiekt
           System.out.println("Null więc wywołujemy konstruktor");
           INSTANCE = new LazySingleton();
       }
       return INSTANCE;
    }
}

package pattern.creational.singleton;

public class EagerSingletonDemo {

    public static void main(String[] args) {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

        System.out.println("=============================");
        System.out.println("Counter nr 1 instancji " + instance1.getCounter());
        System.out.println("Counter nr 2 instancji " + instance2.getCounter());
        System.out.println("=============================");
        instance1.increment();
        System.out.println("=============================");
        System.out.println("Counter nr 1 instancji " + instance1.getCounter());
        System.out.println("Counter nr 2 instancji " + instance2.getCounter());
        System.out.println("=============================");
        instance2.decrement();
        System.out.println("=============================");
        System.out.println("Counter nr 1 instancji " + instance1.getCounter());
        System.out.println("Counter nr 2 instancji " + instance2.getCounter());
        System.out.println("=============================");

        /**
         * modyfikowanie countera na 1 obiekcie zmienia go też na 2 obiekcie czyli
         * mamy do czynienia z tym samym obiektem podpiętym do 2 zmiennych
         */

    }
}

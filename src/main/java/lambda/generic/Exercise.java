package lambda.generic;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Exercise {
    public static void main(String[] args) {
        String s = "Imie";
        Integer i = 1;

        process(s, System.out::println);
        process(i, System.out::println);
        process(new ArrayList<>(), s1 -> System.out.println(s1));
    }
    private static <E> void process(E s, Consumer<E> consumer) {
        consumer.accept(s);
    }
}

package optional;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        String[] tab = new String []{"Tomek", null, "Jan", "Maria", null, "Jan"};
        List<String> stringList = new ArrayList<>(Arrays.asList(tab));

        Integer [] integers = new Integer[]{234,456,654,876,374,87,6543};
        List<Integer> integerList = new ArrayList<>(Arrays.asList(integers));

        stringList.forEach(s -> findNull(s));
        stringList.forEach(s -> check(s));

        stringList.forEach(i -> findNull(i));
        stringList.forEach(integer -> check(integer));
    }

    private static <T> void findNull(T s) {
        var optional = Optional.ofNullable(s);
        if (optional.isEmpty())
            System.out.println("znalazłem nul");
    }
    private static <T> void check(T s){
        var optional = Optional.ofNullable(s);
        if (optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.println("znalazłem null");
    }
}

package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Main {

    public static void main(String[] args) {
        SDAList<String> list = new SDAList<>();
        List<String> listFromElements = new SDAList<>("Tomek", "Maria", "Tadeusz");
        List<String> listOf = SDAList.of("Tomek", "Maria", "Tadeusz");

        System.out.println(listOf.size());

        list.add("Józef");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Damian");
        arrayList.add("Karolina");

        System.out.println(list.union(arrayList));
    }
}

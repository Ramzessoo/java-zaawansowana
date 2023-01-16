package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExercises {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Darek");
        stringList.add("Jarek");
        stringList.add("Darek");
        stringList.add("Krzysiek");
        stringList.add("Paweł");
        stringList.add("Paweł");

        removeDuplicate(stringList);

        System.out.println(stringList);

    }
    private static void removeDuplicate(List<String> list) {
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
    }
}

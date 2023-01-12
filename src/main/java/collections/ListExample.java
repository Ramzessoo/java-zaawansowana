package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        String s1 = "napis";
        String s2 = "napis2";

        String[] strings = new String[10];
        strings[0] = s1;
        strings[1] = s2;
        System.out.println(strings);

        /*
         * Lista
         * */

        List<String> stringList = new ArrayList<>();
        stringList.add(s1);
        stringList.add(s2);
        stringList.add(s2);
        stringList.add(s2);
        stringList.add(s2);
        stringList.remove(0);
        System.out.println(stringList);

        for (String s : stringList) {
            System.out.println(s);
        }
        System.out.println("czy lista zawiera obiekt: " + stringList.contains(s2));
        System.out.println("czy lista jest pusta: " + stringList.isEmpty());
        System.out.println("rozmiar listy: " + stringList.size());
        stringList.clear(); //usuwanie wszystkiego z listy

        /*
        LinkedList
         */
        String s3 = "Nowy napis";
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst(s1);
        linkedList.addLast(s2);
        linkedList.addLast(s3);
        linkedList.addLast(s3);
        System.out.println("pierwszy " + linkedList.getFirst());
        System.out.println("ostatni " + linkedList.getLast());
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}

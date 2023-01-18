package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {

        //-------------SORTOWANIE - COLLECTIONS---------------------------------------------------
        List<Integer> integers = new ArrayList<>(List.of(1, 4, 5, 7, 8, 4356, 8, 9, 87));
        System.out.println("lista bez sortu: " + integers); //lista bez sortu: [1, 4, 5, 7, 8, 4356, 8, 9, 87]
        Collections.sort(integers);
        System.out.println("lista posortowana: " + integers); //lista posortowana: [1, 4, 5, 7, 8, 8, 9, 87, 4356]
        Collections.reverse(integers);
        System.out.println("lista posortowana odwrotnie: " + integers); //lista posortowana odwrotnie: [4356, 87, 9, 8, 8, 7, 5, 4, 1]


        //------------SORTOWANIE - COMPARATOR------------------------------------------------------


        Integer num = 5;
        Integer num2 = 5;
        Integer bigger = 10;

        System.out.println("Mniejsza porównana do większej: " + num.compareTo(bigger)); //-1
        System.out.println("Większa porównana do mniejszej: " + bigger.compareTo(num)); //1
        System.out.println("Liczby są równe: " + num2.compareTo(num));//0

        List<Integer> listForComparing = new ArrayList<>(List.of(1, 4, 5, 7, 8, 4356, 8, 9, 87));
        System.out.println("Lista bez sortu: " + listForComparing);

        listForComparing.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Lista posortowana rosnąco: " + listForComparing);

        //lambda
        listForComparing.sort((o1, o2) -> o2.compareTo(o1));  //lambda
        System.out.println("Lista posortowana malejąco: " + listForComparing);

        listForComparing.sort(Integer::compareTo);  //referencja
        System.out.println("Lista posortowana rosnąco: " + listForComparing);

        //Comparator
        listForComparing.sort(Comparator.reverseOrder()); //referance sam wiedział że musi być reverseOrder
        System.out.println("Lista posortowana malejąco: " + listForComparing);

        //Porównywanie Stringów
        List<String> stringList = new ArrayList<>(List.of("Karol", "Adam", "Zygmunt", "Celina"));
        System.out.println("nieposortowana lista " + stringList);
        stringList.sort(String::compareTo);
        System.out.println("lista posortowana: " + stringList);

        //Porównywanie po polach w klasach
        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Cwik");
        Person jadwiga = new Person("Jadwiga", "Pazdziesz");

        List<Person> people = new ArrayList<>(List.of(jan, karolina, jadwiga));
        System.out.println("nieposortowana lista osób: " + people);
        people.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("Posortowana lista po imionach: " + people);
        people.sort((o1, o2) -> (o1.getName() + o1.getSurname()).compareTo(o2.getName() + o2.getSurname()));
        System.out.println("Posortowana lista po imieniu z nazwiskiem " + people);
    }
}

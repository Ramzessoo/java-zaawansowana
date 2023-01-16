package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(9);
        numbers.add(6);
        numbers.add(3);
        numbers.add(12);
        numbers.add(30);

        System.out.println(findEvenNumbers(numbers));
        System.out.println(findEvenNumbers(numbers));

    }

    public static List<Integer> findEvenNumbers(List<Integer> numbers) {
        List<Integer> listOut = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0)
                listOut.add(number);
        }
        return listOut;
    }

//    public static List<Integer> findEvenNumbers(List<Integer> numbers) {
//        List evenNumbers = new ArrayList<>();
//        int x = numbers.size();
//        for (int i = 0; i < x; i++)
//            if (i % 2 == 0) {
//                evenNumbers.add(i);
//            }
//
//        return evenNumbers;
//    } to było dobrze

}

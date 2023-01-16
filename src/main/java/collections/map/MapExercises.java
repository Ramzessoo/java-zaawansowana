package collections.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    public static void main(String[] args) {

        //chcemy przechowywać wszystkie ocenyJan danego ucznia
        //Jan
        String jan = "Jan Kowalski";
        Integer matematyka1 = 1;
        Integer biologia1 = 5;
        List<Integer> ocenyJan = List.of(matematyka1, biologia1);
        //Basia
        String basia = "Barbara Nowak";
        Integer matematyka2 = 4;
        Integer biologia2 = 4;

        //klasa
        List<Integer> ocenyBasia = List.of(matematyka2, biologia2);
        Map<String, List<Integer>> classroom = new HashMap();
        classroom.put(jan, ocenyJan);
        classroom.put(basia, ocenyBasia);

        //wyswietlamy uczniów wraz z ocenami
        var entrySet = classroom.entrySet(); //robi się Set z elementami z mapy
        for (Map.Entry<String, List<Integer>> record : entrySet) {
            System.out.println("uczeń " + record.getKey() + " oceny "+ record.getValue());
        }
    }
}

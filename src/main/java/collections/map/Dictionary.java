package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

    private static final Map<String, String> dictionary = getDictionary();

    private static Map<String, String> getDictionary() {
        Map<String, String> pairs = new HashMap<>();
        pairs.put("mama", "mother");
        pairs.put("kot", "cat");
        pairs.put("pociąg", "train");
        return pairs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo w języku polskim, aby przetłumaczyć");
        String polishWord = scanner.next();
        if (dictionary.containsKey(polishWord)) {
            System.out.println("słowo: "+polishWord+ " po angielsku to: " + dictionary.get(polishWord));
        } else {
            System.out.println("słowo nie występuje w słowniku");
        }
    }
}

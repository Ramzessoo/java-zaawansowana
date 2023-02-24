package programming.testing;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.regex.Pattern;

/**
 * TDD - Test Driven Development
 * Pisanie wg podejścia Red -> Green -> Refactor
 * czyli:
 * Piszemy najmniejszy możliwy niedziałający kawałek kodu
 * nastęonie:
 * 1. piszemy test do tego kawałka kodu - test się wywala przy uruchomieniu
 * 2. poprawiamu ten kawałek kodu aby test przeszedł
 * 3. robimy refactor kodu tak aby był ładniejszy, za każdym razem test (i wszystkie poprzednie testy) ma przechodzić
 * 4. dostajemy nowy kawałek kodu do napisania - wracamy do pkt 1.
 */

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        if (Pattern.matches("\\d((,|\\s)\\d)+", numbers)) {
            String[] arrayOfNumbers = numbers.split("(,|\\s)");
            int sum = 0;
            int parsedNumber;
            for (String number : arrayOfNumbers) {
                parsedNumber = toInt(number);
                sum += parsedNumber;
            }
            return sum;
//       } else if (numbers.startsWith("//")){
//            String[] separateString = numbers.split("\n",2);
//            String separator = separateString[0].substring(2);
//            numbers = separateString[1];
//            String[] digits = numbers.split("(?<=" +digits+ ")|(?=" + digits + ")");
//            int sum = 0;
//            for (String number : digits){
//                sum += Integer.parseInt(number);
//            }
        } else {
            return toInt(numbers);

        }

    }

    public static int toInt(String numbers) {

        return Integer.parseInt(numbers);
    }
}
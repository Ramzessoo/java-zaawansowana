package programming.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calculator;

    @BeforeEach
    void setup() {
        calculator = new StringCalculator();
    }

    //Jeśli przekażemy pusty String to mamy na wyjściu dostać 0
    @Test
    void shouldReturnZeroWhenEmptyPassed() {
        String entry = "";

        int result = calculator.add(entry);

        assertEquals(0, result, "Result is not zero!!!");
    }

    //Jeśli przekażemy w Stringu jedną liczbę to mamy ją dostać na wyjściu
    @Test
    void shouldReturnNumberPassedFromEntry() {
        String entry = "1";

        int result = calculator.add(entry);

        assertEquals(1, result, "Should return 1");
    }
    //Jeśli przekażemy w Stringu liczby po przecinku to mamy dostać ich sumę: "3,6" -> 9
    @Test
    void shouldReturnSumOfCommaSeparatedNumber(){
        String entry = "3,5";

        int result = calculator.add(entry);

        assertEquals(8, result,"Should return 8");
    }

    //Jeśli przekażemy w Stringu kilka liczb po przecinku to mamy dostać ich sumę: "3,6,1,2" -> 12
    @Test
    void shouldReturnSumOfAllCommaSeparatedNumbers() {
        String entry = "3,6,1,2";

        int result = calculator.add(entry);

        assertEquals(12, result, "Should return 12");
    }

    //Jeśli przekażemy w stringu znak nowej linii zamiast jednego (lub kilku) z przecinków to też ma zadziałał:
    //"1,2\n5,6" -> 14
    @Test
    void shouldAddNumbersFromSeparatedLines() {
        String entry = "1,2\n3,4";

        int result = calculator.add(entry);

        assertEquals(10, result, "Result is not correct, expected 10");
    }

    //Dodajemy możliwość określenia własnego "przecinka", czyli w pierwszej linii możemy zdefiniować
    //czym liczby będą oddzielane, format następujący: "//;\n1;2\n3;4" -> 10
//    @Test
//    void shouldAllowDefiningCustomSeparator() {
//        String entry = "//;\\n1;2\\n3;4";
//
//        int result = calculator.add(entry);
//
//        assertEquals(15, result, "Result incorrect, should return 15");
//    }
}
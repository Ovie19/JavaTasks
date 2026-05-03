import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigitsTest {
    @Test
    public void testThatSumDigitsMethodsGivesTheAdditionOfDigitsInANumber() {
        int number = 123;
        int expected = SumDigits.sumDigits(number);
        int actual = 6;
        assertEquals(actual, expected);

        number = 0;
        expected = SumDigits.sumDigits(number);
        actual = 0;
        assertEquals(actual, expected);

        number = 999;
        expected = SumDigits.sumDigits(number);
        actual = 27;
        assertEquals(actual, expected);

        number = 1000;
        expected = SumDigits.sumDigits(number);
        actual = 1;
        assertEquals(actual, expected);
    }
}
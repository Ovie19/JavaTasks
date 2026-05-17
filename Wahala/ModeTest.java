import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModeTest {
    @Test
    public void testThatGetNumberOfMostOccuringDigitsReturnsValidResponse() {
        int[] numbersOne = {1, 2, 2, 2, 3};
        int expected = Mode.getNumberOfMostOccuringDigits(numbersOne);
        int actual = 3;
        assertEquals(actual, expected);

        int[] numbersTwo = {1, 5, 5, 6, 4};
        int expectedTwo = Mode.getNumberOfMostOccuringDigits(numbersTwo);
        int actualTwo = 2;
        assertEquals(actualTwo, expectedTwo);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReoccuringNumbersTest {
    @Test
    public void testThatGetReoccuringNumbersMethodsOnArrayGivesValidResult() {
        int[] numbersOne = {2, 1, 2, 5, 2, 4};
        int[] expected = ReoccuringNumbers.getOccuringNumbers(numbersOne);
        int[] actual = {2};
        assertArrayEquals(actual, expected);

        int[] numbersTwo = {2, 1, 2, 5, 2, 4};
        int[] expectedTwo = ReoccuringNumbers.getOccuringNumbers(numbersTwo);
        int[] actualTwo = {2};
        assertArrayEquals(actualTwo, expectedTwo);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeCalculatorTest {
    @Test
    public void testThatTheRangeMethodsOnAnArrayGivesTheValidRange() {
        int[] numbers = {2, 5, 7, 9, 20};
        int expected = RangeCalculator.range(numbers);
        int actual = 18;
        assertEquals(actual, expected);

        int[] arrays = {2, 3, 1, 4, 6};
        expected = RangeCalculator.range(arrays);
        actual = 5;
        assertEquals(actual, expected);
    }
}
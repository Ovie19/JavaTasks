import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskTwelveTest {
    @Test
    public void testThatSwapElementsMethodGivesAccurateResult() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] expected = TaskTwelve.swapElements(numbers);
        int[] actual = {2, 1, 4, 3, 6, 5};
        assertArrayEquals(actual, expected);

        int[] numbersTwo = {1, 2, 3, 4, 5};
        int[] expectedTwo = TaskTwelve.swapElements(numbersTwo);
        int[] actualTwo = {2, 1, 4, 3, 5};
        assertArrayEquals(actualTwo, expectedTwo);
    }
}
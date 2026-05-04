import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskFiveTest {
    @Test
    public void testThatGetOddIndexedArrayMethodReturnsOddIndexedArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] expected = TaskFive.getOddIndexedArray(numbers);
        int[] actual = {2, 4, 6};
        assertArrayEquals(actual, expected);

        int[] numbersTwo = {1, 2, 3, 4, 5};
        int[] expectedTwo = TaskFive.getOddIndexedArray(numbersTwo);
        int[] actualTwo = {2, 4};
        assertArrayEquals(actualTwo, expectedTwo);
    }
}
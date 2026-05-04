import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskElevenTest {
    @Test
    public void testThatMinimumMethodReturnsTheMinimumNumberInOddIndexedArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] oddIndexedArray = TaskEleven.getOddIndexedArray(numbers);
        int expected = TaskEleven.maximum(oddIndexedArray);
        int actual = 6;
        assertEquals(actual, expected);

        int[] numbersTwo = {2, 3, 4, 5, 6};
        int[] oddIndexedArrayTwo = TaskEleven.getOddIndexedArray(numbersTwo);
        int expectedTwo = TaskEleven.maximum(oddIndexedArrayTwo);
        int actualTwo = 5;
        assertEquals(actualTwo, expectedTwo);
    }
}
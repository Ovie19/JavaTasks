import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskNineTest {
    @Test
    public void testThatMinimumMethodReturnsTheMinimumNumberInOddIndexedArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] oddIndexedArray = TaskNine.getOddIndexedArray(numbers);
        int expected = TaskNine.minimum(oddIndexedArray);
        int actual = 2;
        assertEquals(actual, expected);

        int[] numbersTwo = {2, 3, 4, 5, 6};
        int[] oddIndexedArrayTwo = TaskNine.getOddIndexedArray(numbersTwo);
        int expectedTwo = TaskNine.minimum(oddIndexedArrayTwo);
        int actualTwo = 3;
        assertEquals(actualTwo, expectedTwo);
    }
}
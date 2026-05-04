import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskSevenTest {
    @Test
    public void testThatSumMethodReturnsSumOfNumbersInOddIndexedArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] oddIndexedArray = TaskSeven.getOddIndexedArray(numbers);
        int expected = TaskSeven.sum(oddIndexedArray);
        int actual = 12;
        assertEquals(actual, expected);

        int[] numbersTwo = {2, 4, 6, 8, 10};
        int[] oddIndexedArrayTwo = TaskSeven.getOddIndexedArray(numbers);
        int expectedTwo = TaskSeven.sum(oddIndexedArrayTwo);
        int actualTwo = 12;
        assertEquals(actualTwo, expectedTwo);
    }
}
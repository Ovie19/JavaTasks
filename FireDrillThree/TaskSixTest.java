import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskSixTest {
    @Test
    public void testThatSumMethodReturnsSumOfNumbersInEvenIndexedArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] evenIndexedArray = TaskSix.getEvenIndexedArray(numbers);
        int expected = TaskSix.sum(evenIndexedArray);
        int actual = 9;
        assertEquals(actual, expected);

        int[] numbersTwo = {2, 3, 4, 5, 6};
        int[] evenIndexedArrayTwo = TaskSix.getEvenIndexedArray(numbersTwo);
        int expectedTwo = TaskSix.sum(evenIndexedArrayTwo);
        int actualTwo = 12;
        assertEquals(actualTwo, expectedTwo);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskEightTest {
    @Test
    public void testThatMinimumMethodReturnsTheMinimumNumberInEvenIndexedArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] evenIndexedArray = TaskEight.getEvenIndexedArray(numbers);
        int expected = TaskEight.minimum(evenIndexedArray);
        int actual = 1;
        assertEquals(actual, expected);

        int[] numbersTwo = {2, 3, 4, 5, 6};
        int[] evenIndexedArrayTwo = TaskEight.getEvenIndexedArray(numbersTwo);
        int expectedTwo = TaskEight.minimum(evenIndexedArrayTwo);
        int actualTwo = 2;
        assertEquals(actualTwo, expectedTwo);
    }
}
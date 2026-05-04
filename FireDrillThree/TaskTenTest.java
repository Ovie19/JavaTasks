import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTenTest {
    @Test
    public void testThatMaximumMethodReturnsTheMaximumNumberInEvenIndexedArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] evenIndexedArray = TaskTen.getEvenIndexedArray(numbers);
        int expected = TaskTen.maximum(evenIndexedArray);
        int actual = 5;
        assertEquals(actual, expected);

        int[] numbersTwo = {2, 3, 4, 5, 6};
        int[] evenIndexedArrayTwo = TaskTen.getEvenIndexedArray(numbersTwo);
        int expectedTwo = TaskTen.maximum(evenIndexedArrayTwo);
        int actualTwo = 6;
        assertEquals(actualTwo, expectedTwo);
    }
}
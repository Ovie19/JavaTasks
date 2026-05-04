import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskFourTest {
    @Test
    public void testThatGetEvenIndexedArrayMethodReturnsEvenIndexedArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] expected = TaskFour.getEvenIndexedArray(numbers);
        int[] actual = {1, 3, 5};
        assertArrayEquals(actual, expected);

        int[] numbersTwo = {1, 2, 3, 4, 5};
        int[] expectedTwo = TaskFour.getEvenIndexedArray(numbersTwo);
        int[] actualTwo = {1, 3, 5};
        assertArrayEquals(actualTwo, expectedTwo);
    }
}
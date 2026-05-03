import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void testThatFactorialMethodGivesAccurateResult() {
        int number = 0;
        int expected = Factorial.factorial(number);
        int actual = 1;
        assertEquals(actual, expected);

        number = 1;
        expected = Factorial.factorial(number);
        actual = 1;
        assertEquals(actual, expected);

        number = 5;
        expected = Factorial.factorial(number);
        actual = 120;
        assertEquals(actual, expected);

        number = 6;
        expected = Factorial.factorial(number);
        actual = 720;
        assertEquals(actual, expected);
    }
}
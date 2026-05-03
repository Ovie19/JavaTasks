import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest {
    @Test
    public void testThatIsEvenMethodGivesAccurateResult() {
        int number = 4;
        assertTrue(EvenChecker.isEven(number));

        number = 7;
        assertFalse(EvenChecker.isEven(number));

        number = 0;
        assertTrue(EvenChecker.isEven(number));

        number = -2;
        assertTrue(EvenChecker.isEven(number));
    }
}
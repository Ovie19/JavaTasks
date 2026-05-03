import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberCheckerTest {
    @Test
    public void testThatIsPrimeMethodReturnsValidResponse() {
        int number = 2;
        assertTrue(PrimeNumberChecker.isPrime(number));

        number = 1;
        assertFalse(PrimeNumberChecker.isPrime(number));

        number = 17;
        assertTrue(PrimeNumberChecker.isPrime(number));

        number = 4;
        assertFalse(PrimeNumberChecker.isPrime(number));

        number = 0;
        assertFalse(PrimeNumberChecker.isPrime(number));
    }
}
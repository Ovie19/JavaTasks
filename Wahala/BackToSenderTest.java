import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest {

    @Test
    public void testThatIfRiderDeliversMoreThanSeventyPercentReturnsRightAmount() {
        int numberOfParcelDelivered = 80;

        int expectedAmount = BackToSender.getRiderWages(numberOfParcelDelivered);

        int actualAmount = 45000;
        assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void testThatIfRiderDeliversMoreThanSixtyAndLessThanSixtyNinePercentReturnsRightAmount() {
        int numberOfParcelDelivered = 64;

        int expectedAmount = BackToSender.getRiderWages(numberOfParcelDelivered);

        int actualAmount = 21000;
        assertEquals(expectedAmount, actualAmount);
    }

     @Test
    public void testThatIfRiderDeliversMoreThanFiftyAndLessThanFiftyNinePercentReturnsRightAmount() {
        int numberOfParcelDelivered = 56;

        int expectedAmount = BackToSender.getRiderWages(numberOfParcelDelivered);

        int actualAmount = 16200;
        assertEquals(expectedAmount, actualAmount);
    }

     @Test
    public void testThatIfRiderDeliversLessThanFiftyPercentReturnsRightAmount() {
        int numberOfParcelDelivered = 25;

        int expectedAmount = BackToSender.getRiderWages(numberOfParcelDelivered);

        int actualAmount = 9000;
        assertEquals(expectedAmount, actualAmount);
    }
}

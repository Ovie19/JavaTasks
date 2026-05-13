import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class OshoFreePromoEngineTest {

    @Test
    public void testThatAmountLessThanFiveThousandReturnsZeroPercentDiscount() {
        double amount = 4_000.00;

        int expectedPercentage = OshoFreePromoEngine.getDiscountPercentage(amount);
        int actualPercentage = 0;

        assertEquals(actualPercentage, expectedPercentage);
    }

    @Test
    public void testThatAnyAmountReturnsAccurateDiscountPercentage() {
        double amount = 5_000.00;
        int expectedPercentage = OshoFreePromoEngine.getDiscountPercentage(amount);
        int actualPercentage = 10;
        assertEquals(actualPercentage, expectedPercentage);

        amount = 12_000.00;
        expectedPercentage = OshoFreePromoEngine.getDiscountPercentage(amount);
        actualPercentage = 10;
        assertEquals(actualPercentage, expectedPercentage);

        amount = 15_000.00;
        expectedPercentage = OshoFreePromoEngine.getDiscountPercentage(amount);
        actualPercentage = 20;
        assertEquals(actualPercentage, expectedPercentage);


        amount = 30_000.00;
        expectedPercentage = OshoFreePromoEngine.getDiscountPercentage(amount);
        actualPercentage = 35;
        assertEquals(actualPercentage, expectedPercentage);
    }

    @Test
    public void testThatIsValidPromoCodeChecksIfAPromoCodeIsValid() {
        String promoCode = "STARTER10";
        assertTrue(OshoFreePromoEngine.isValidPromoCode(promoCode));

        promoCode = "BIGBOY20";
        assertTrue(OshoFreePromoEngine.isValidPromoCode(promoCode));

        promoCode = "OSHOFREE35";
        assertTrue(OshoFreePromoEngine.isValidPromoCode(promoCode));
    }

    @Test
    public void testThatIsValidPromoCodeChecksIfAPromoCodeIsValidEvenWithSmallCases() {
        String promoCode = "starter10";
        assertTrue(OshoFreePromoEngine.isValidPromoCode(promoCode));

        promoCode = "bigboy20";
        assertTrue(OshoFreePromoEngine.isValidPromoCode(promoCode));

        promoCode = "oshofree35";
        assertTrue(OshoFreePromoEngine.isValidPromoCode(promoCode));
    }

    @Test
    public void testThatIsValidPromoCodeReturnsFalseForInvalidPromoCode() {
        String promoCode = "FAKE99";
        assertFalse(OshoFreePromoEngine.isValidPromoCode(promoCode));

        promoCode = "fake99";
        assertFalse(OshoFreePromoEngine.isValidPromoCode(promoCode));
    }

    @Test
    public void testThatAmountWithValidPromoCodeReturnsAccurateFinalPrice() {
        double cartTotal = 18_000.00;
        String promoCode = "BIGBOY20";
        double expectedPrice = OshoFreePromoEngine.getFinalCartPrice(cartTotal, promoCode);
        double actualPrice = 14_400.00;
        assertEquals(actualPrice, expectedPrice, 0.001);


        cartTotal = 4_000.00;
        promoCode = "starter10";
        expectedPrice = OshoFreePromoEngine.getFinalCartPrice(cartTotal, promoCode);
        actualPrice = 4_000.00;
        assertEquals(actualPrice, expectedPrice, 0.001);


        cartTotal = 5_000.00;
        promoCode = "starter10";
        expectedPrice = OshoFreePromoEngine.getFinalCartPrice(cartTotal, promoCode);
        actualPrice = 4_500.00;
        assertEquals(actualPrice, expectedPrice, 0.001);


        cartTotal = 15_000.00;
        promoCode = "BIGBOY20";
        expectedPrice = OshoFreePromoEngine.getFinalCartPrice(cartTotal, promoCode);
        actualPrice = 12_000.00;
        assertEquals(actualPrice, expectedPrice, 0.001);


        cartTotal = 30_000.00;
        promoCode = "OsHoFrEe35";
        expectedPrice = OshoFreePromoEngine.getFinalCartPrice(cartTotal, promoCode);
        actualPrice = 19_500.00;
        assertEquals(actualPrice, expectedPrice, 0.001);
    }

    @Test
    public void testThatAmountWithInvalidPromoCodeReturnsBackTheCartTotalWithoutDiscountApplied() {
        double cartTotal = 18_000.00;
        String promoCode = "FAKE99";
        double expectedPrice = OshoFreePromoEngine.getFinalCartPrice(cartTotal, promoCode);
        assertEquals(cartTotal, expectedPrice, 0.001);


        cartTotal = 4_000.00;
        promoCode = "start10";
        expectedPrice = OshoFreePromoEngine.getFinalCartPrice(cartTotal, promoCode);
        assertEquals(cartTotal, expectedPrice, 0.001);

        cartTotal = 5_000.00;
        promoCode = "starter11";
        expectedPrice = OshoFreePromoEngine.getFinalCartPrice(cartTotal, promoCode);
        assertEquals(cartTotal, expectedPrice, 0.001);


        cartTotal = 15_000.00;
        promoCode = "BIGBOY02";
        expectedPrice = OshoFreePromoEngine.getFinalCartPrice(cartTotal, promoCode);
        assertEquals(cartTotal, expectedPrice, 0.001);


        cartTotal = 30_000.00;
        promoCode = "1OsHoFrEe35";
        expectedPrice = OshoFreePromoEngine.getFinalCartPrice(cartTotal, promoCode);
        assertEquals(cartTotal, expectedPrice, 0.001);
    }


    @Test
    public void testThat() {
        double cartTotal = -18_000.00;
        String promoCode = "STARTER10";
        assertThrows(IllegalArgumentException.class, () -> OshoFreePromoEngine.getFinalCartPrice(cartTotal, promoCode));
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaWahalaTest {
    @Test
    public void testThatItReturnsValidNumberOfBoxes() {
        int pizzaType = 4; // Odogwu
        int numberOfGuests = 45;

        int expectedValue = PizzaWahalaMethods.getTotalNumberOfSufficientPizzaBoxes(numberOfGuests, pizzaType);

        int actualValue = 4;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testThatItReturnsValidLeftoverSlices() {
        int pizzaType = 4; // Odogwu
        int numberOfGuests = 45;

        int expectedValue = PizzaWahalaMethods.getTotalNumberOfLeftoverPizzas(numberOfGuests, pizzaType);

        int actualValue = 3;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testThatItReturnsValidPriceForPizzas() {
        int pizzaType = 4; // Odogwu
        int numberOfGuests = 45;

        int expectedValue = PizzaWahalaMethods.getTotalPriceOfPizzaBoxes(numberOfGuests, pizzaType);

        int actualValue = 20800;
        assertEquals(expectedValue, actualValue);
    }
}

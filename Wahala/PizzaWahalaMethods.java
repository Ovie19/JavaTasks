public class PizzaWahalaMethods {
    public static int getTotalNumberOfSufficientPizzaBoxes(int numberOfGuests, int pizzaType) {
        int slicesPerBox = getNumberOfSlicesForPizzaType(pizzaType);
        return (int) Math.ceil((double) numberOfGuests / slicesPerBox);
    }

    public static int getTotalNumberOfLeftoverPizzas(int numberOfGuests, int pizzaType) {
        int numbeOfPizzaSlices = getNumberOfSlicesForPizzaType(pizzaType);
        int numberOfPizzaBoxes = getTotalNumberOfSufficientPizzaBoxes(numberOfGuests, pizzaType);
        int totalSlices = numbeOfPizzaSlices * numberOfPizzaBoxes;
        return totalSlices - numberOfGuests;
    }

    public static int getTotalPriceOfPizzaBoxes(int numberOfGuests, int pizzaType) {
        int numberOfPizzaBoxes = getTotalNumberOfSufficientPizzaBoxes(numberOfGuests, pizzaType);
        int pricePerPizzaBox = getPricePerPizzaBox(pizzaType);
        return numberOfPizzaBoxes * pricePerPizzaBox;
    }

    public static int getNumberOfSlicesForPizzaType(int pizzaType) {
        switch(pizzaType) {
            case 1:
                return 4;
            case 2:
                return 6;
            case 3:
                return 8;
            case 4:
                return 12;
            default:
                return 0;
        }
    }

    public static int getPricePerPizzaBox(int pizzaType) {
        switch(pizzaType) {
            case 1:
                return 2500;
            case 2:
                return 2900;
            case 3:
                return 4000;
            case 4:
                return 5200;
            default:
                return 0;
        }
    }
}
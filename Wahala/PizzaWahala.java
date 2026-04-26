import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("1. Sapa size\n2. Small Money\n3. Big boys\n4. Odogwu");
        System.out.print("Enter pizza type: ");
        int pizzaType = inputCollector.nextInt();

        System.out.print("Enter number of guests: ");
        int numberOfGuests = inputCollector.nextInt();

        int numberOfSufficientPizzaBoxes = getTotalNumberOfSufficientPizzaBoxes(numberOfGuests, pizzaType);
        System.out.println("\nThe number of sufficient pizza boxes is " + numberOfSufficientPizzaBoxes);

        int numberOfLeftoverPizzas = getTotalNumberOfLeftoverPizzas(numberOfGuests, pizzaType);
        System.out.println("The number of leftover pizzas slices is " + numberOfLeftoverPizzas);

        int totalPriceOfPizzas = getTotalPriceOfPizzaBoxes(numberOfGuests, pizzaType);
        System.out.println("The total price of the pizzas boxes is " + totalPriceOfPizzas);
    }

    public static int getTotalNumberOfSufficientPizzaBoxes(int numberOfGuests, int pizzaType) {
        int numberOfSlicesInPizzaBox = getNumberOfSlicesInPizzaBoxes(pizzaType);
        return (int) Math.ceil((double) numberOfGuests / numberOfSlicesInPizzaBox);
    }

    public static int getTotalNumberOfLeftoverPizzas(int numberOfGuests, int pizzaType) {
        int numberOfSlicesInPizzaBox = getNumberOfSlicesInPizzaBoxes(pizzaType);
        int totalSlicesBought = getTotalNumberOfSufficientPizzaBoxes(numberOfGuests, pizzaType) * numberOfSlicesInPizzaBox;
        return totalSlicesBought - numberOfGuests;
    }

    public static int getTotalPriceOfPizzaBoxes(int numberOfGuests, int pizzaType) {
        int pricePerPizzaBox = getPricePerPizzaBox(pizzaType);
        int numberOfSufficientPizzaBox = getTotalNumberOfSufficientPizzaBoxes(numberOfGuests, pizzaType);
        return numberOfSufficientPizzaBox * pricePerPizzaBox;
    }

    public static int getNumberOfSlicesInPizzaBoxes(int pizzaType) {
        switch (pizzaType) {
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
        switch (pizzaType) {
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

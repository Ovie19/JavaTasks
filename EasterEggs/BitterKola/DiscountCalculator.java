import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price: ");
        double price = input.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercentage = input.nextDouble();

        double discountAmount = (discountPercentage / 100) * price;
        double finalPrice = price - discountAmount;
        System.out.printf("The final price after discount is %.2f%n",
            finalPrice);
    }
}

// Computes the gratuity and total

import java.util.Scanner;

public class GratuityCalculator {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter subtotal value: ");
        double subtotal = inputCollector.nextDouble();

        System.out.print("Enter gratuity rate: ");
        double gratuityRate = inputCollector.nextDouble();

        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;

        System.out.printf("%nThe gratuity is $%.1f%n", gratuity);
        System.out.printf("The total is $%.1f%n", total);
    }
}

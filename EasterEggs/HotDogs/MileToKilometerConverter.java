// Converts from miles to Kilometers

import java.util.Scanner;

public class MileToKilometerConverter {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);
        double constant = 1.6;

        System.out.print("Enter the values in miles: ");
        double distanceInMiles = inputCollector.nextDouble();

        double distanceInKilometer = constant * distanceInMiles;
        System.out.printf("The distane in kilometer is %.2f%n", distanceInKilometer);
    }
}

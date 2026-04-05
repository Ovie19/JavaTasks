// Price = pricePerGallon * distance / fuelEfficiency

import java.util.Scanner;

public class CostOfTripCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance of drive: ");
        double distance = input.nextDouble();
        System.out.print("Enter price of fuel per gallon: ");
        double pricePerGallon = input.nextDouble();
        System.out.print("Enter fuel efficiency in miles per gallon: ");
        double fuelEfficiency = input.nextDouble();

        double costOfTrip = pricePerGallon * distance / fuelEfficiency;
        System.out.printf("The cost of the trip is %.2f%n", costOfTrip);
    }
}

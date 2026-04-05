// Calculates the minimum runway length needed for a plane to takeoff

import java.util.Scanner;

public class MinimumRunwayLengthCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the take-off speed: ");
        double takeOffSpeed = input.nextDouble();
        System.out.print("Enter the acceleration: ");
        double acceleration = input.nextDouble();

        double length = takeOffSpeed * takeOffSpeed / (2 * acceleration);
        System.out.printf("The minimum runway length needed for the plane to take off is %.2f%n", length);
    }
}

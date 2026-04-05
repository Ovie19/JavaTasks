// Converts meters to feet

import java.util.Scanner;

public class MeterToFeetConverter {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);
        double constant = 3.2786;

        System.out.print("Enter the values in meter: ");
        double valueInMeter = inputCollector.nextDouble();

        double valueInFeet = constant * valueInMeter;
        System.out.printf("%.2f meters is %.4f feets%n", valueInMeter, valueInFeet);
    }
}

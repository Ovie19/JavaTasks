// Converts square meters into ping

import java.util.Scanner;

public class SquareMeterToPingConverter {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);
        double constant = 0.3025;

        System.out.print("Enter the values in square meter: ");
        double valueInSquareMeter = inputCollector.nextDouble();

        double valueInPing = constant * valueInSquareMeter;
        System.out.printf("%.2f square meters is %.4f ping%n", valueInSquareMeter, valueInPing);
    }
}

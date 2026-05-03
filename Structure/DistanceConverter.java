import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        double twoMilesToKilometers = mileToKilometer(2);
        double twoKilometersToMiles = kilometerToMile(2);

        System.out.println("2 Miles = " + twoMilesToKilometers + " Kilometers");
        System.out.println("2 Kilometers = " + twoKilometersToMiles + " Miles");
        System.out.println();

        System.out.printf("Miles%13s%n", "Kilometers");
        for(int miles = 1; miles <= 10; miles++) {
            double kilometer = mileToKilometer(miles);
            System.out.printf("%5d%13f%n", miles, kilometer);
        }
        System.out.println();

        System.out.printf("Kilometers%9s%n", "Miles");
        for(int kilometer = 1; kilometer <= 10; kilometer++) {
            double miles = kilometerToMile(kilometer);
            System.out.printf("%-10d%12f%n", kilometer, miles);
        }
    }

    public static double mileToKilometer(double mile) {
        return mile * 1.60934;
    }

    public static double kilometerToMile(double kilometer) {
        return kilometer * 0.621371;
    }
}
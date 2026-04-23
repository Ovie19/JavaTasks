import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter miles driven: ");
        int milesDriven = inputCollector.nextInt();

        System.out.print("Enter gallons used or -1 to exit: ");
        int gallonsUsed = inputCollector.nextInt();

        double totalMilesPerGallonPerTrip = 0;

        while(gallonsUsed != -1) {
            double milesPerGallonPerTrip = (double) milesDriven / gallonsUsed;
            totalMilesPerGallonPerTrip += milesPerGallonPerTrip;

            System.out.printf("The miles per gallon for this trip is %.2f%n%n", milesPerGallonPerTrip);

            System.out.print("Enter miles driven: ");
            milesDriven = inputCollector.nextInt();

            System.out.print("Enter gallons used or -1 to exit: ");
            gallonsUsed = inputCollector.nextInt();
        }

        System.out.printf("%nThe total miles per gallon for this trip is %.2f%n", totalMilesPerGallonPerTrip);

    }
}
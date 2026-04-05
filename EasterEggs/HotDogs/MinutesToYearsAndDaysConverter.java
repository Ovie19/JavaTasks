// Converts minutes to years and days

import java.util.Scanner;

public class MinutesToYearsAndDaysConverter {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int numberOfMinutes = inputCollector.nextInt();

        int hours = numberOfMinutes / 60;
        int days = hours / 24;

        int remainingDays = days % 365;
        int years = days / 365;
        
        System.out.printf("%d minutes is %d years and %d days%n", numberOfMinutes, years, remainingDays);
    }
}

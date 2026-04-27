import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = inputCollector.nextInt();

        boolean isLeapYearResult = isLeapYear(year);

        if (isLeapYearResult)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;

        return false;
    }
}

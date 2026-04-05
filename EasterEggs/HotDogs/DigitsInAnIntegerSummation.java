// Sums up all digits in an integer between 0 - 1000

import java.util.Scanner;

public class DigitsInAnIntegerSummation {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a value between 0 and 1000: ");
        int value = inputCollector.nextInt();

        int thirdDigit = value % 10;
        value = value / 10;

        int secondDigit = value % 10;
        value = value / 10;

        int firstDigit = value % 10;
        int total = firstDigit + secondDigit + thirdDigit;
        System.out.printf("The total number of digits is %d%n", total);
    }
}

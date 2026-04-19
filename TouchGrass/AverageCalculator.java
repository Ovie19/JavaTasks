import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        int sumOfNumbers = 0;
        int count = 0;

        System.out.print("Enter a number (Negative number to terminate): ");
        int number = inputCollector.nextInt();

        while (number >= 0) {
            sumOfNumbers += number;
            count++;
            System.out.print("Enter a number (Negative number to terminate): ");
            number = inputCollector.nextInt();
        }

        double average = (double) sumOfNumbers / count;
        System.out.println("The average of the positive scores entered is " + average);
    }
}

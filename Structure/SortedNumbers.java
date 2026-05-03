import java.util.Scanner;

public class SortedNumber {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        double[] numbers = new double[3];

        for(int index = 0; index < numbers.length; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            numbers[index] = inputCollector.nextDouble();
        }

        displaySortedNumbers(numbers[0], numbers[1], numbers[2]);
    }

    public static void displaySortedNumbers(double numberOne, double numberTwo, double numberThree) {
        double highest;
        double mid;
        double lowest;
        if(numberOne > numberTwo && numberOne > numberThree) {
            highest = numberOne;
            if (numberTwo > numberThree) {
                mid = numberTwo;
                lowest = numberThree;
            } else {
                mid = numberThree;
                lowest = numberTwo;
            }
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            highest = numberTwo;
            if (numberOne > numberThree) {
                mid = numberOne;
                lowest = numberThree;
            } else {
                mid = numberThree;
                lowest = numberOne;
            }
        } else {
            highest = numberThree;
            if (numberOne > numberTwo) {
                mid = numberOne;
                lowest = numberTwo;
            } else {
                mid = numberTwo;
                lowest = numberOne;
            }
        }

        System.out.println(highest + " " + mid + " " + lowest);
    }
}
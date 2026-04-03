import java.util.Scanner;

public class TaskFourteen {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = inputScanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = inputScanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = inputScanner.nextInt();

        int total = firstNumber + secondNumber + thirdNumber;
        double average = total / 3;

        System.out.printf("The average of %d, %d, and %d is %.2f%n", firstNumber, 
            secondNumber, thirdNumber, average);
    }
}



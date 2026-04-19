import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();

        int maximum = maximum(firstNumber, secondNumber);

        System.out.println("The maximum number is " + maximum);
    }

    public static int maximum(int firstNumber, int secondNumber) {
        int maximum = firstNumber;

        if (secondNumber > maximum)
            maximum = secondNumber;

        return maximum;
    }
}

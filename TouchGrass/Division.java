import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();

        int quotient = divide(firstNumber, secondNumber);

        System.out.println("The quotient is " + quotient);
    }

    public static int divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0)
            return 0;

        return firstNumber / secondNumber;
    }
}

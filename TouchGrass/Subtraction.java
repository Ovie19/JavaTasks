import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();

        int difference = subtract(firstNumber, secondNumber);

        System.out.println("The absolute difference is " + difference);
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return (int) Math.abs(firstNumber - secondNumber);
    }
}

import java.util.Scanner;

public class FactorChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        if (secondNumber % firstNumber == 0) {
            System.out.println("The first number is a factor of the second number");
        } else {
            System.out.println("The first number is not a factor of the second number");
        }
    }
}

import java.util.Scanner;

public class TaskThirty {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();
        
        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();

        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;

        System.out.printf("%n%d + %d = %d%n", firstNumber, secondNumber, sum);
        System.out.printf("%d * %d = %d%n", firstNumber, secondNumber, product);
    }
}



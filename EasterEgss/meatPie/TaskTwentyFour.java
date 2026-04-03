import java.util.Scanner;

public class TaskTwentyFour {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();
        
        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();

        int temporary = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temporary;

        System.out.println("\nAfter swapping the two numbers:");
        System.out.printf("The first number is %d%n", firstNumber);
        System.out.printf("The second number is %d%n", secondNumber);
    }
}



import java.util.Scanner;

public class NumberComparator {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();

        if (firstNumber == secondNumber)
            System.out.println(0);
        else if (firstNumber > secondNumber)
            System.out.println(1);
        else
            System.out.println(-1);
    }
}
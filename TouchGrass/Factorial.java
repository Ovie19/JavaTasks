import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inputCollector.nextInt();

        long factorial = factorialOf(number);
        System.out.println("The factorial is " + factorial);
    }

    public static long factorialOf(int number) {
        long factorial = 1;

        for (int index = number; index > 1; index--) {
            factorial *= index;
        }

        return factorial;
    }
}

import java.util.Scanner;

public class EvenNumberChecker {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inputCollector.nextInt();

        boolean result = isEven(number);
        if (result)
            System.out.println(number + " is an even number");
        else
            System.out.println(number + " is not an even number");
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0)
            return true;

        return false;
    }
}

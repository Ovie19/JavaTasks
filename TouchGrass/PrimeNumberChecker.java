import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inputCollector.nextInt();

        boolean result = isPrimeNumber(number);
        if (result)
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");
    }

    public static boolean isPrimeNumber(int number) {
        for (int index = 2; index * index < number; index++) {
            if (number % index == 0)
                return false;
        }

        return true;
    }
}

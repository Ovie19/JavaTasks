import java.util.Scanner;

public class FactorMethod {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inputCollector.nextInt();

        int numbersOfFactor = factorOf(number);
        System.out.println("The number of factors is " + numbersOfFactor);
    }

    public static int factorOf(int number) {
        int count = 0;

        for (int index = 1; index <= number / 2; index++) {
            if (number % index == 0)
                count++;
        }

        return count + 1;
    }
}

import java.util.Scanner;

public class SumOfPrimeFactorsInANumber {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        int sumOfFactors = sumOfPrimeFactor(number);
        System.out.println("The sum of the prime factors is " + sumOfFactors);
    }

    public static int sumOfPrimeFactor(int number) {
        int sumOfFactors = 0;

        for (int factor = 2; number > 1;) {
            if (number % factor == 0) {
                sumOfFactors += factor;
                number /= factor;
            } else {
                factor++;
            }
        }

        return sumOfFactors;
    }
}
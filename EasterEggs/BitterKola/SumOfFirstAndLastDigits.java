import java.util.Scanner;

public class SumOfFirstAndLastDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit integer: ");
        int number = input.nextInt();

        int fifthDigit = number % 10;
        number /= 10;
        int fourthDigit = number % 10;
        number /= 10;
        int thirdDigit = number % 10;
        number /= 10;
        int secondDigit = number % 10;
        number /= 10;
        int firstDigit = number % 10;

        int sumOfFirstAndLastDigit = firstDigit + fifthDigit;
        System.out.printf("The sum of the first and fifth digits is %d%n",
            sumOfFirstAndLastDigit);
    }
}

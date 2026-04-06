import java.util.Scanner;

public class SumOfThreeDigitNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int thirdDigit = number % 10;
        number /= 10;
        int secondDigit = number % 10;
        number /= 10;
        int firstDigit = number % 10;

        int sum = firstDigit + secondDigit + thirdDigit;
        System.out.printf("%d + % d + % d = %d%n", firstDigit, 
            secondDigit, thirdDigit, sum);
    }
}

import java.util.Scanner;

public class DivisibleByItsSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();
        int temporaryNumber = number;

        int thirdDigit = temporaryNumber % 10;
        temporaryNumber /= 10;
        int secondDigit = temporaryNumber % 10;
        temporaryNumber /= 10;
        int firstDigit = temporaryNumber % 10;

        int sumOfThreeDigit = firstDigit + secondDigit + thirdDigit;
        if (number % sumOfThreeDigit == 0) {
            System.out.println("The number is divisible by the sum of its digits");
        } else {
            System.out.println("The number is not divisible by the sum of its digits");
        }
    }
}

// A palindrome checker program

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int thirdDigit = number % 10;
        number /= 10;
        int secondDigit = number % 10;
        number /= 10;
        int firstDigit = number % 10;

        if(firstDigit == thirdDigit) {
            System.out.println("It is a palindrome integer");
        } else {
            System.out.println("It is not a palindrome integer");
        }
    }
}

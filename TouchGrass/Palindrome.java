import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inputCollector.nextInt();

        boolean result = isPalindrome(number);
        if (result)
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");
    }

    public static boolean isPalindrome(int number) {
        int fifthDigit = number % 10;
        number /= 10;
        int fourthDigit = number % 10;
        number /= 10;
        int thirdDigit = number % 10;
        number /= 10;
        int secondDigit = number % 10;
        number /= 10;
        int firstDigit = number % 10;

        if (fifthDigit != firstDigit || fourthDigit != secondDigit)
            return false;

        return true;
    }
}

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        boolean isPalindrome = isPalindrome(number);
        if(isPalindrome)
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is not a palindrome.");
    }

    public static int reverse(int number) {
        int reverse = 0;

        while(number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }
}
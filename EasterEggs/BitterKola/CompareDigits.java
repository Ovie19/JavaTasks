import java.util.Scanner;

public class CompareDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a two-digit integer: ");
        int number = input.nextInt();

        int secondDigit = number % 10;
        number /= 10;
        int firstDigit = number % 10;

        if (secondDigit > firstDigit) {
            System.out.println("Reversing its digits produces a larger number");
        } else if (firstDigit > secondDigit) {
            System.out.println("Reversing its digits produces a smaller number");
        } else {
            System.out.println("Reversing its digits produces the same number");
        } 
    }
}

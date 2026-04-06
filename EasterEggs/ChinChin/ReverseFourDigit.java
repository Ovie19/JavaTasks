import java.util.Scanner;

public class ReverseFourDigit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four-digit integer: ");
        int number = input.nextInt();

        int fourthDigit = number % 10;
        number /= 10;
        int thirdDigit = number % 10;
        number /= 10;
        int secondDigit = number % 10;
        number /= 10;
        int firstDigit = number % 10;

        String reverse = String.format("%d%d%d%d", fourthDigit, thirdDigit,
            secondDigit, firstDigit);
        System.out.printf("The reverse is %s%n", reverse);
    }
}

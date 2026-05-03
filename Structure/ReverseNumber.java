import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        reverse(number);
    }

    public static void reverse(int number) {
        int reverse = 0;

        while(number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        System.out.println(reverse);
    }
}
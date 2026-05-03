import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = inputCollector.nextLong();

        System.out.println("The sum of its digit is " + sumDigits(number));
    }

    public static int sumDigits(long number) {
        int sum = 0;

        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
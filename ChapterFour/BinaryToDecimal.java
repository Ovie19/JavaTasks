import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int number = inputCollector.nextInt();

        int count = 0;
        int total = 0;

        while (number > 0) {

            int remainder = number % 10;
            total += (int) Math.pow(2, count) * remainder;
            number /= 10;
            count++;
        }

        System.out.println("The decimal equivalent is " + total);
    }
}
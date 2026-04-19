import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        int reversedNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        System.out.println(reversedNumber);
    }
}

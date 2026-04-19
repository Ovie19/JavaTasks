import java.util.Scanner;

public class NumberSquare {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inputCollector.nextInt();

        long squareOfNumber = squareOf(number);
        System.out.println("The square of the number is " + squareOfNumber);
    }

    public static long squareOf(int number) {
        return number * number;
    }
}

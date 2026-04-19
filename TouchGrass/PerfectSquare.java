import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inputCollector.nextInt();

        boolean result = isPerfectSquare(number);
        if (result)
            System.out.println(number + " is a perfect square");
        else
            System.out.println(number + " is not a perfect square");
    }

    public static boolean isPerfectSquare(int number) {
        double squareRootOfNumber = Math.sqrt(number);
        int castedSquareRootOfNumber = (int) squareRootOfNumber;

        return squareRootOfNumber == castedSquareRootOfNumber;
    }
}

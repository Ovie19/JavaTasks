import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        double squareRootOfNumber = Math.sqrt(number);
        int castedSquareRootOfNumber = (int) squareRootOfNumber;

        if (squareRootOfNumber == castedSquareRootOfNumber) {
            System.out.println("Number is a perfect square");
        } else {
            System.out.println("Number is not a perfect square");
        }
    }
}

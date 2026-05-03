import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        displayPattern(number);
    }

    public static void displayPattern(int number) {
        for(int row = 1; row <= number; row++) {
            for(int column = 1; column <= row; column++)
                System.out.print(column + " ");
            System.out.println();
        }
    }
}
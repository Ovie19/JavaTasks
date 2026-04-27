import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = inputCollector.nextInt();

        for(int index = 1; index <= numberOfRows; index++) {
            for(int innerIndex = numberOfRows; innerIndex >= 1; innerIndex--) {
                if (innerIndex <= index)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
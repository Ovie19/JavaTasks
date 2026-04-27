import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = inputCollector.nextInt();

        for(int index = 1; index <= numberOfRows; index++) {
            for(int innerIndex = 1; innerIndex <= index; innerIndex++) {
                System.out.print("* ");
                if(innerIndex != index)
                    System.out.print("- ");
            }

            System.out.println();
            for(int innerIndex = 1; innerIndex <= index; innerIndex++) {
                if(index != numberOfRows)
                    System.out.printf("%-4s", "'");
            }

            System.out.println();
        }
    }
}
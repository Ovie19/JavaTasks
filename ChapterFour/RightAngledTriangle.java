import java.util.Scanner;

public class RightAngledTriangle {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter length of triangle base between 1 - 10: ");
        int baseLength = inputCollector.nextInt();

        for(int rowCount = 1; rowCount <= baseLength; rowCount++){
            for(int columnCount = 1; columnCount <= rowCount; columnCount++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
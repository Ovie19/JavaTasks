import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int length = inputCollector.nextInt();

        printMatrix(length);
    }

    public static void printMatrix(int length) {
        Random randomGenerator = new Random();

        for(int row = 1; row <= length; row++) {
            for(int column = 1; column <= length; column++) {
                int randomNumber = randomGenerator.nextInt(2);
                System.out.print(randomNumber + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class KataKata {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int[] numbers = new int[10];

        for(int index = 0; index < numbers.length; index++) {
            System.out.print("Enter a number: ");
            numbers[index] = inputCollector.nextInt();
        }

        for(int index = 0; index < numbers.length; index++)
            System.out.print(numbers[index] + " ");

        System.out.println();
    }
}
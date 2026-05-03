import java.util.Scanner;

public class ReverseOrder {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        int[] numbers = new int[10];

        for(int index = 0; index < numbers.length; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            numbers[index] = inputCollector.nextInt();
        }

        System.out.println();
        for(int index = numbers.length - 1; index >= 0; index--) {
            System.out.print(numbers[index] + " ");
        }
        System.out.println();
    }
}
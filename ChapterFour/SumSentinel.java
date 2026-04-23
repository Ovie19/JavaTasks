import java.util.Scanner;

public class SumSentinel {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int userInput = inputCollector.nextInt();

        int sum = 0;

        while (sum < userInput) {
            System.out.print("Enter a number: ");
            int number = inputCollector.nextInt();

            sum += number;
        }
    }
}
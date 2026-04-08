import java.util.Scanner;

public class SumOfFirstNValues {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        for (int counter = 1; counter <= number; counter++) {
            sum += counter;
            System.out.println(sum);
        }

        System.out.printf("The sum of 1 to %d is %d%n", number, sum);
    }
}

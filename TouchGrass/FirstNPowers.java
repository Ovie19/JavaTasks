import java.util.Scanner;

public class FirstNPowers {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        for (int index = 1; index <= number; index++) {
            long powerValue = (long) Math.pow(2, index);
            System.out.printf("2 ^ %d = %d%n", index, powerValue);
        }
    }
}

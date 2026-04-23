import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inputCollector.nextInt();

        long factorial = 1;

        for(int multiplier = number; multiplier >= 1; multiplier--)
            factorial *= multiplier;

        System.out.printf("%d! = %d%n", number, factorial);
    }
}
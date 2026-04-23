import java.util.Scanner;

public class MathematicalConstantE {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int numberOfTerms = inputCollector.nextInt();

        double constantE = 1;

        for(int term = 1; term <= numberOfTerms; term++) {
            constantE += 1.0 / factorialOf(term);
        }

        System.out.println("e = " + constantE);
    }

    public static long factorialOf(int number) {
        long factorial = 1;

        for(int multiplier = number; multiplier >= 1; multiplier--)
            factorial *= multiplier;

        return factorial;
    }
}
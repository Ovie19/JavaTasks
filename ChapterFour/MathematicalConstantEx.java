import java.util.Scanner;

public class MathematicalConstantEx {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int numberOfTerms = inputCollector.nextInt();

        System.out.print("Enter value of x: ");
        int xValue = inputCollector.nextInt();

        double constantEx = 1;

        for(int term = 1; term <= numberOfTerms; term++) {
            constantEx += Math.pow(xValue, term) / factorialOf(term);
        }

        System.out.println("e^x = " + constantEx);
    }

    public static long factorialOf(int number) {
        long factorial = 1;

        for(int multiplier = number; multiplier >= 1; multiplier--)
            factorial *= multiplier;

        return factorial;
    }
}
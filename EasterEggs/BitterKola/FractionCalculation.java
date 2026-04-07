import java.util.Scanner;

public class FractionCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter fraction 1 numerator: ");
        int fractionOneNumerator =input.nextInt();
        System.out.print("Enter fraction 1 denominator: ");
        int fractionOneDenominator = input.nextInt();

        System.out.print("Enter fraction 2 numerator: ");
        int fractionTwoNumerator =input.nextInt();
        System.out.print("Enter fraction 2 denominator: ");
        int fractionTwoDenominator = input.nextInt();
    
        if (fractionOneDenominator == 0 || fractionTwoDenominator == 0) {
            System.out.println("Denominator cannot be 0");
            return;
        }

        double fractionOne = (double) fractionOneNumerator / fractionOneDenominator;
        double fractionTwo = (double) fractionTwoNumerator / fractionTwoDenominator;

        double sum = fractionOne + fractionTwo;
        double difference = fractionOne - fractionTwo;
        double product = fractionOne * fractionTwo;
        double quotient = fractionOne / fractionTwo;

        System.out.printf("The sum of the fractions is %.2f%n", sum);
        System.out.printf("The difference of the fractions is %.2f%n", difference);
        System.out.printf("The product of the fractions is %.2f%n", product);
        System.out.printf("The quotient of the fractions is %.2f%n", quotient);
    }
}

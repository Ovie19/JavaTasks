import java.util.Scanner;

public class IntegerCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstDigit = input.nextInt();
        System.out.print("Enter second number: ");
        int secondDigit = input.nextInt();

        if(firstDigit > 0 &&  secondDigit > 0) {
            int sum = firstDigit + secondDigit;
            System.out.printf("The sum is %d%n", sum);
        } else if (firstDigit < 0 &&  secondDigit < 0){
            int product = firstDigit * secondDigit;
            System.out.printf("The product is %d%n", product);
        } else {
            int difference = 0;
            if (firstDigit > secondDigit) {
                difference = firstDigit - secondDigit;
            } else {
                difference = secondDigit - firstDigit;
            }
        
            System.out.printf("The difference between the larger and smaller number is %d%n",
                difference);
        }
    }
}

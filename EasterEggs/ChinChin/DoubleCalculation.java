import java.util.Scanner;

public class DoubleCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double: ");
        double number1 = input.nextDouble();
        System.out.print("Enter a double: ");
        double number2 = input.nextDouble();

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double smallest = 0;
        double largest = 0;
        
        if(number1 > number2) {
            largest = number1;
            smallest = number2;
        } else {
            largest = number2;
            smallest = number1;
        } 

        System.out.printf("The largest number is %.2f%n", largest);
        System.out.printf("The smallest number is %.2f%n", smallest);
        System.out.printf("%.2f + %.2f = %.2f%n", number1, number2, sum);
        System.out.printf("%.2f - %.2f = %.2f%n", number1, number2, difference);
        System.out.printf("%.2f x %.2f = %.2f%n", number1, number2, product);
        
        if (number2 != 0) {
            System.out.printf("%.2f / %.2f = %.2f%n", number1, number2, 
                (number1 / number2));
        } else {
            System.out.println("Error: you cannot divide by 0");
        }
    }
}

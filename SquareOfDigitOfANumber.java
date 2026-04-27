import java.util.Scanner;

public class SquareOfDigitOfANumber {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
                
        while (number > 0) {
            int digit = number % 10;
            int squareOfDigit = digit * digit;
            System.out.println(squareOfDigit);
            number /= 10;
        }
    }
}

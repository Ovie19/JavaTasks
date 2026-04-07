import java.util.Scanner;

public class MultipleChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstDigit = input.nextInt();
        System.out.print("Enter second number: ");
        int secondDigit = input.nextInt();

        if(secondDigit % firstDigit == 0) {
            System.out.println("The first digit is a multiple of the second");
        } else {
            System.out.println("The first digit is not a multiple of the second");
        }  
    }
}

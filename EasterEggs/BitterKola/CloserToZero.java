import java.util.Scanner;

public class CloserToZero {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
            System.out.println("The second number is closer to 0");
        } else if (Math.abs(firstNumber) < Math.abs(secondNumber)) {
            System.out.println("The first number is closer to 0");
        } else {
            System.out.println("Both are equally closer to 0");
        } 
    }
}

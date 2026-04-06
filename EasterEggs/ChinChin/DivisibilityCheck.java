import java.util.Scanner;

public class DivisibilityCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if(number % 4 == 0 && number % 5 == 0) {
            System.out.println("The number is divisible by 4 and 5");
        } 
        if(number % 4 == 0 || number % 5 == 0) {
            System.out.println("The number is divisible by 4 or 5");
        }
        if(number % 4 == 0 || number % 5 == 0) {
            if(number % 4 != 0 && number % 5 == 0 || 
                number % 4 == 0 && number % 5 != 0) {

                System.out.println("The number is divisible by 4 or 5 but not by both");
            }
        }
    }
}

import java.util.Scanner;

public class PinValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your pin: ");
        int pin = input.nextInt();

        if(pin >= 1000 && pin <= 9999) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        } 
    }
}

// A palindrome checker program

import java.util.Scanner;

public class ATMSimulation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pin = 1234;

        System.out.print("Enter ATM pin: ");
        int userPin = input.nextInt();

        if(pin == userPin) {
            System.out.println("Balance: $1000");
        } else {
            System.out.println("Invalid PIN");
        }
    }
}

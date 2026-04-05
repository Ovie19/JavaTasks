// Calculates the monthly interest on user's balance

import java.util.Scanner;

public class MonthlyInterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter balance: ");
        double balance = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate / 1200);
        System.out.printf("This month's interest is %.2f%n", interest);
    }
}

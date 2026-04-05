// Calculates the future investment value

import java.util.Scanner;

public class FutureInvestmentCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), 
            (years * 12));
        System.out.printf("This future investment value is %.2f%n", futureInvestmentValue);
    }
}

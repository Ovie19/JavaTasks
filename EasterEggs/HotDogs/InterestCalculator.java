// Calculates interest on a monthly saving amount

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double annualInterestRate = 3.75 / 100;
        double monthlyRate = annualInterestRate / 12;

        System.out.print("Enter monthly saving amount: ");
        double monthySavingAmount = input.nextDouble();

        // Month 1
        double totalAmount = monthySavingAmount * ( 1 + monthlyRate);
        System.out.printf("After month 1, the total money is %.2f%n", totalAmount);
        // Month 2
        totalAmount = totalAmount * ( 1 + monthlyRate);
        System.out.printf("After month 2, the total money is %.2f%n", totalAmount);
        // Month 3
        totalAmount = totalAmount * ( 1 + monthlyRate);
        System.out.printf("After month 3, the total money is %.2f%n", totalAmount);
        // Month 4
        totalAmount = totalAmount * ( 1 + monthlyRate);
        System.out.printf("After month 4, the total money is %.2f%n", totalAmount);
        // Month 5
        totalAmount = totalAmount * ( 1 + monthlyRate);
        System.out.printf("After month 5, the total money is %.2f%n", totalAmount);
        // Month 6
        totalAmount = totalAmount * ( 1 + monthlyRate);
        System.out.printf("After month 6, the total money is %.2f%n", totalAmount);
    }
}

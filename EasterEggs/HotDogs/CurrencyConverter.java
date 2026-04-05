// Currency converter

// 2000 USD -> 400 RMB, exchangeRate = 2000 / 400  

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter exchange rate from USD to RMB: ");
        double exchangeRateFromUSDToRMB = input.nextDouble();
        double exchangeRateFromRMBToUSD = 1 / exchangeRateFromUSDToRMB;

        System.out.print("0. Convert from dollars to RMB" + 
            "\n1. Convert from RMB to dollars\nEnter an option: ");
        int userChoice = input.nextInt();

        if (userChoice != 0 && userChoice != 1) {
            System.out.println("Error: Enter a valid code!!!");
            return;
        }

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        if(userChoice == 0) {
            double amountInRMB = amount * exchangeRateFromUSDToRMB;
            System.out.printf("%.2f USD is %.2f RMB%n", amount, amountInRMB);
        } else {
            double amountInUSD = amount * exchangeRateFromRMBToUSD;
            System.out.printf("%.2f RMB is %.2f USD%n", amount, amountInUSD);
        }
    }
}

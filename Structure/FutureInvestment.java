import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = inputCollector.nextDouble();
        System.out.print("Enter annual interest rate (e.g: 20): ");
        double annualInterestRate = inputCollector.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Years\tInvestment Value");
        for(int years = 1; years <= 30; years++) {
            double investmentValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
            System.out.printf("%4d%20.2f%n", years, investmentValue);
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
    }
}
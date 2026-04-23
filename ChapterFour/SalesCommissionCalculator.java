import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        double minimumPayment = 200;
        double commissionPercentage = 9.0 / 100;

        int count = 1;
        double totalSales = 0;

        System.out.print("Enter price for item " + count + " or -1 to exit: ");
        double price = inputCollector.nextDouble();

        while (price != -1) {
            totalSales += price;
            count++;

            System.out.print("Enter price for item " + count + " or -1 to exit: ");
            price = inputCollector.nextDouble();
        }

        double salesCommission = totalSales * commissionPercentage;
        double totalPayment = minimumPayment + salesCommission;

        System.out.printf("Your total payment for this week is $%.2f%n", totalPayment);
    }
}
import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        for (int count = 1; count <= 3; count++) {
            System.out.print("Enter citizen's name: ");
            String citizenName = inputCollector.next();

            System.out.print("Enter monthly earnings: ");
            double earnings = inputCollector.nextDouble();

            double taxRate = earnings > 30000 ? 20 : 15;

            double citizenTaxAmountPerMonth = earnings * taxRate / 100;

            System.out.println("Citizen's name: " + citizenName);
            System.out.println("Monthly tax: " + citizenTaxAmountPerMonth);
            System.out.println("Yearly tax: " + (citizenTaxAmountPerMonth * 12) + "\n");
        }
    }
}
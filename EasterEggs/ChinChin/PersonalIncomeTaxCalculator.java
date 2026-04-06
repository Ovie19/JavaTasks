import java.util.Scanner;

public class PersonalIncomeTaxCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("0. Single\n1. Married filing jointly or Qualified widow(er)\n" +
            "2. Married filing separately\n3. Head of household.\nEnter your filing status: ");
        int status = input.nextInt();

        System.out.print("Enter your taxable income: ");
        double taxableIncome = input.nextDouble();
        double tax = 0;

        if(taxableIncome < 0) {
            System.out.println("Taxable income must be greater than 0");
            return;
        }

        switch(status) {
            case 0:
                 if(taxableIncome <= 8350) {
                    tax = 0.1 * taxableIncome;
                 } else if(taxableIncome <= 33950) {
                    tax = 0.15 * taxableIncome;
                 } else if(taxableIncome <= 82250) {
                    tax = 0.25 * taxableIncome;
                 } else if(taxableIncome <= 171550) {
                    tax = 0.28 * taxableIncome;
                 } else if(taxableIncome <= 372950) {
                    tax = 0.33 * taxableIncome;
                 } else {
                    tax = 0.35 * taxableIncome;
                 }
                break;
            case 1:
                 if(taxableIncome <= 16700) {
                    tax = 0.1 * taxableIncome;
                 } else if(taxableIncome <= 67900) {
                    tax = 0.15 * taxableIncome;
                 } else if(taxableIncome <= 137050) {
                    tax = 0.25 * taxableIncome;
                 } else if(taxableIncome <= 208850) {
                    tax = 0.28 * taxableIncome;
                 } else if(taxableIncome <= 372950) {
                    tax = 0.33 * taxableIncome;
                 } else {
                    tax = 0.35 * taxableIncome;
                 }
                break;
            case 2:
                 if(taxableIncome <= 8350) {
                    tax = 0.1 * taxableIncome;
                 } else if(taxableIncome <= 33950) {
                    tax = 0.15 * taxableIncome;
                 } else if(taxableIncome <= 68525) {
                    tax = 0.25 * taxableIncome;
                 } else if(taxableIncome <= 104425) {
                    tax = 0.28 * taxableIncome;
                 } else if(taxableIncome <= 186475) {
                    tax = 0.33 * taxableIncome;
                 } else {
                    tax = 0.35 * taxableIncome;
                 }
                break;
            case 3:
                 if(taxableIncome <= 11950) {
                    tax = 0.1 * taxableIncome;
                 } else if(taxableIncome <= 45500) {
                    tax = 0.15 * taxableIncome;
                 } else if(taxableIncome <= 117450) {
                    tax = 0.25 * taxableIncome;
                 } else if(taxableIncome <= 190200) {
                    tax = 0.28 * taxableIncome;
                 } else if(taxableIncome <= 372950) {
                    tax = 0.33 * taxableIncome;
                 } else {
                    tax = 0.35 * taxableIncome;
                 }
                break;
            default:
                System.out.println("Invalid response!!!");
                return;
        }

        System.out.printf("Your tax is %.2f%n", tax);
    }
}

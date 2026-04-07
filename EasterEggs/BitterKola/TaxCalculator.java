import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's monthly salary: ");
        double employeeSalary = input.nextDouble();

        double monthlyTax = 0;
        if(employeeSalary > 600000) {
            double taxableIncome = employeeSalary - 600000;
            employeeSalary -= taxableIncome;
            monthlyTax += 0.25 * taxableIncome;
        }

        if(employeeSalary > 300000 ) {
            double taxableIncome = employeeSalary - 300000;
            monthlyTax += 0.15 * taxableIncome;
        }
        
        double annualTax = monthlyTax * 12;
        System.out.printf("Your monthly tax is %.2f%n", monthlyTax);
        System.out.printf("Your annual tax is %.2f%n", annualTax);
    }
}

import java.util.Scanner;

public class SocialInsuranceDeduction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double salary = input.nextDouble();

        double deduction = 0;
        if(salary > 500000) {
            double deductableIncome = salary - 500000;
            salary -= deductableIncome;
            deduction += 0.1 * deductableIncome;
        }

        if(salary > 150000 ) {
            double deductableIncome = salary - 150000;
            salary -= deductableIncome;
            deduction += 0.075 * deductableIncome;
        }

        if(salary > 50000 ) {
            double deductableIncome = salary - 50000;
            salary -= deductableIncome;
            deduction += 0.05 * deductableIncome;
        }
        
        System.out.printf("Your social insurance deduction for the month is %.2f%n", deduction);
    }
}

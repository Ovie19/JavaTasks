import java.util.Scanner;

public class HourlyWagesCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter hourly wage: ");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter total hours worked: ");
        int hoursWorked = input.nextInt();
 
        double totalWages = 0;

        if(hoursWorked > 40) {
            int remainingHours = hoursWorked - 40;
            double normalHoursWages = 40 * hourlyRate;
            double extraHoursWages = remainingHours * hourlyRate * 1.5;
            totalWages = normalHoursWages + extraHoursWages;
        } else {       
            totalWages = hoursWorked * hourlyRate;
        }

        System.out.printf("The total wages after working for %d hours is $%.2f%n",
            hoursWorked, totalWages);
    }
}

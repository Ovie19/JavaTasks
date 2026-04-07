import java.util.Scanner;

public class ConvertMinutesToDaysHoursAndMinute {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        int remainingMinutes = minutes % 60;
        int totalHours = minutes / 60;
        int remainingHours = totalHours % 24;
        int totalDays = totalHours / 24;

        System.out.printf("%d days, %d hours, %d minutes%n",
            totalDays, remainingHours, remainingMinutes);
    }
}

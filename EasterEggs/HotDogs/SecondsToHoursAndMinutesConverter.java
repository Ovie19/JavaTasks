// Converts seconds to hours and minutes

import java.util.Scanner;

public class SecondsToHoursAndMinutesConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of seconds: ");
        int numberOfSeconds = input.nextInt();
        int remainingSeconds = numberOfSeconds % 60;

        int numberOfMinutes = numberOfSeconds / 60;
        int remainingMinutes = numberOfMinutes % 60;

        int numberOfHours = numberOfMinutes / 60;

        System.out.printf("%d seconds = %d hour, %d minutes, %d seconds%n", 
            numberOfSeconds, numberOfHours, remainingMinutes, remainingSeconds);
    } 
}

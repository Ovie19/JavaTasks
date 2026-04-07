import java.util.Scanner;

public class DaysOfTheWeekDisplay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of days from today: ");
        int numberOfDays = input.nextInt();

        int day = numberOfDays % 7;

        switch(day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
        }
    }
}

// Monday - 0
// Tuesday - 1
// Wed - 2
// Thurs - 3
// Fri - 4
// Sat - 5
// Sun - 6

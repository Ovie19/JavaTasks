import java.util.Scanner;

public class DaysInAMonthDisplayer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1 - 12): ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("There are 31 days in the month");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("There are 30 days in the month");
                break;
            case 2:
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("There are 29 days in the month");
                } else {
                   System.out.println("There are 28 days in the monthr");
                } 
                break;
            default:
                System.out.println("Enter a valid number for month");
        }
    }
}

// 1 - January
// 2 - February (28 or 29)
// 3 - March
// 4 - April (30)
// 5 - May
// 6 - June (30)
// 7 - July
// 8 - August
// 9 - September (30)
// 10 - October
// 11 - November (30)
// 12 - December

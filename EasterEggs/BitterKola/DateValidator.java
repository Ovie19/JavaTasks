import java.util.Scanner;

public class DateValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(day >= 1 && day <= 30 && year > 0) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date");
                }
                break;
            case 4: case 6: case 9: case 11:
                if(day >= 1 && day <= 31 && year > 0) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date");
                }
                break;
            case 2:
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    if(day >= 1 && day <= 29 && year > 0) {
                        System.out.println("Valid date");
                    } else {
                        System.out.println("Invalid date");
                    }
                } else {
                   if(day >= 1 && day <= 28 && year > 0) {
                        System.out.println("Valid date");
                    } else {
                        System.out.println("Invalid date");
                    }
                } 
                break;
            default:
                System.out.println("Invalid date");
        }
    }
}

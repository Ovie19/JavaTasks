import java.util.Scanner;

public class GreetingDisplay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current hour (0 - 23): ");
        int hour = input.nextInt();

        if(hour >= 5 && hour <= 11) {
            System.out.println("Good Morning");
        } else if(hour >= 12 && hour <= 17) {
            System.out.println("Good Afternoon");
        } else if(hour >= 18 && hour <= 21) {
            System.out.println("Good Evening");
        } else if((hour >= 22 && hour <= 23) || 
                (hour >= 0 && hour <= 4)) {
            System.out.println("Good Night");
        } else {
            System.out.println("Invalid response");
        }
    }
}

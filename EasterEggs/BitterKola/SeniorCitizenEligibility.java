import java.util.Scanner;

public class SeniorCitizenEligibility {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();
        System.out.print("Enter your current year: ");
        int currentYear = input.nextInt();

        int age = currentYear - birthYear;
        if (age >= 65) {
            System.out.println("You are eligible for senior citizen discount");
        } else {
            System.out.println("You are not eligible for senior citizen discount");
        }
    }
}

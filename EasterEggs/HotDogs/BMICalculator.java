// Calculates and display user's BMI
// BMI = (weightInPounds * 703) / (heightInInches ^ 2)

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of weight(pounds): ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter value of height(inches): ");
        double heightInInches = input.nextDouble();

        double bmi = (weightInPounds * 703) / (heightInInches * heightInInches);
        System.out.printf("Your BMI is %.2f%n", bmi);
    }
}

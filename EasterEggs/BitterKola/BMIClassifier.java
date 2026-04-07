// BMI = weight(kg) / height(m)^2

import java.util.Scanner;

public class BMIClassifier {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (kilogram): ");
        double weightInKg = input.nextDouble();
        System.out.print("Enter height (meter): ");
        double heightInMeter = input.nextDouble();

        double bmi = weightInKg / (heightInMeter * heightInMeter);
        if(bmi < 18.5) {
            System.out.println("Underweight");
        } else if(bmi < 25) {
            System.out.println("Normal");
        } else if(bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}

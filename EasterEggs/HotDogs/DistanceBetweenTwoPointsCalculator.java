// Calculates the distance between two points

import java.util.Scanner;

public class DistanceBetweenTwoPointsCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double annualInterestRate = 3.75 / 100;
        double monthlyRate = annualInterestRate / 12;

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        double squareOfChangeInX = (x2 - x1) * (x2 - x1);
        double squareOfChangeInY = (y2 - y1) * (y2 - y1);
        double distance = Math.sqrt(squareOfChangeInX + squareOfChangeInY);
        
        System.out.printf("The distance between the points is %.2f%n", distance);
    }
}

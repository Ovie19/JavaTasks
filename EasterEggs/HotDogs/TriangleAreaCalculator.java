// Calculates the area of a triangle

import java.util.Scanner;

public class TriangleAreaCalculator {

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
        System.out.print("Enter x2: ");
        double x3 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y3 = input.nextDouble();

        // Side 1 -> (x1, y1), (x2, y2)
        double squareOfChangeInX = (x2 - x1) * (x2 - x1);
        double squareOfChangeInY = (y2 - y1) * (y2 - y1);
        double side1 = Math.sqrt(squareOfChangeInX + squareOfChangeInY);

        // Side 2 -> (x1, y1), (x3, y3)
        squareOfChangeInX = (x3 - x1) * (x3 - x1);
        squareOfChangeInY = (y3 - y1) * (y3 - y1);
        double side2 = Math.sqrt(squareOfChangeInX + squareOfChangeInY);

        // Side 3 -> (x2, y2), (x3, y3)
        squareOfChangeInX = (x2 - x3) * (x2 - x3);
        squareOfChangeInY = (y2 - y3) * (y2 - y3);
        double side3 = Math.sqrt(squareOfChangeInX + squareOfChangeInY);

        double s = (side1 + side2 + side3) / 2;
        double productOfDifferenceFromS = s * (s - side1) * (s - side2) * (s - side3);
        double area = Math.sqrt(productOfDifferenceFromS);
        
        System.out.printf("The area of the triangle is %.2f%n", area);
    }
}

// Calculates the area of an equilateral traingle

import java.util.Scanner;

public class EquilateralTriangleAreaCalculator {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter length of triangle: ");
        double length = inputCollector.nextDouble();

        double area = (Math.sqrt(3) / 4) * length * length;
        System.out.printf("The area of an equilateral triangle with length of %.2f is %.2f%n",
            length, area);
    }
}

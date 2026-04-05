// Calculate distance using Newton's equation

import java.util.Scanner;

public class NewtonEquationCalculator {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("To calculate the distance using newton's equation.");
        System.out.print("Enter value of initial velocity: ");
        double initialVelocity = inputCollector.nextDouble();

        System.out.print("Enter value of time span: ");
        double timeSpan = inputCollector.nextDouble();

        System.out.print("Enter value of accelaration: ");
        double accelaration = inputCollector.nextDouble();

        double distance = initialVelocity * timeSpan + (0.5 * accelaration * timeSpan * timeSpan);
        
        System.out.printf("%nThe distance is %.2f%n", distance);
    }
}

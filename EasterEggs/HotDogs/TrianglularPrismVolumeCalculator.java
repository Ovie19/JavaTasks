// Calculates the volume of a triangular prism

import java.util.Scanner;

public class TrianglularPrismVolumeCalculator {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter length of triangle: ");
        double length = inputCollector.nextDouble();

        double area = (Math.sqrt(3) / 4) * length * length;
        double volume = area * length;

        System.out.printf("The volume of the triangular prism with length of %.2f is %.2f%n",
            length, volume);
    }
}

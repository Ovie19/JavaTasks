// Surface area -> (2 * PI * r^2) + (2 * PI * r * h) -> 2 * PI * r) * (r + h)
// Volume -> PI * r^2 * h
// PI -> 3.14159

import java.util.Scanner;

public class CylinderAreaAndVolume {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double PI = 3.14159;

        System.out.print("Enter cylinder height: ");
        double height = input.nextDouble();
        System.out.print("Enter cylinder radius: ");
        double radius = input.nextDouble();

        double surfaceArea = (2 * PI * radius) * (radius + height);
        double volume = PI * radius * radius * height;

        System.out.printf("%nThe surface area of the cylinder is %.2f%n", 
            surfaceArea);
        System.out.printf("The volume of the cylinder is %.2f%n", volume);
    }
}

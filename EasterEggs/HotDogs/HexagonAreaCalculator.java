// Calculate the area of an hexagon

import java.util.Scanner;

public class HexagonAreaCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate the area of an hexagon.");
        System.out.print("Enter the value of the side: ");
        double lengthOfSide = input.nextDouble();
        
        double area = (3 * Math.sqrt(3) / 2) * lengthOfSide * lengthOfSide;
        
        System.out.printf("The area of the hexagon is %.2f%n", area);
    }
}

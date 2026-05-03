import java.util.Scanner;

public class AreaOfRegularPentagon {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number of sides: ");
        int numberOfSides = inputCollector.nextInt();

        System.out.print("Enter length of side: ");
        double side = inputCollector.nextDouble();

        double area = area(numberOfSides, side);
        System.out.println("The area of the pentagon is " + area);
    }

    public static double area(int number, double side) {
        return (number * side * side) / (4 * Math.tan(180 / number));
    }
}
import java.util.Scanner;

public class AreaOfPentagon {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter length of side: ");
        double side = inputCollector.nextDouble();

        double area = area(side);
        System.out.println("The area of the pentagon is " + area);
    }

    public static double area(double side) {
        return (5 * side * side) / (4 * Math.tan(180 / 5));
    }
}
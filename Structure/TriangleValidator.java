import java.util.Scanner;

public class TriangleValidator {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        double[] sides = new double[3];

        for(int index = 0; index < 3; index++) {
            System.out.print("Enter side " + (index + 1) + ": ");
            sides[index] = inputCollector.nextDouble();
        }

        boolean isValid = isValid(sides[0], sides[1], sides[2]);

        if(isValid)
            System.out.println("Triangle area is valid");
        else
            System.out.println("Triangle area is invalid");
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double productOfDifferenceFromS = s * (s - side1) * (s - side2) * (s - side3);
        double area = Math.sqrt(productOfDifferenceFromS);

        return area;
    }

    public static boolean isValid(double side1, double side2, double side3) {
        return area(side1, side2, side3) > 0;
    }
}
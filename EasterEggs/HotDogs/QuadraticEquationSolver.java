// Calculate the number of roots of an equation

import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Enter value of a: ");
        int a = input.nextInt();
        System.out.print("Enter value of b: ");
        int b = input.nextInt();
        System.out.print("Enter value of c: ");
        int c = input.nextInt();

        int discriminant = (b * b) - (4 * a * c);
        System.out.printf("%n%dx^2 + %dx + %d = 0%n", a, b ,c);

        if (discriminant > 0) {
            System.out.println("The equation has two roots");
        } else if (discriminant == 0) {
            System.out.println("The equation one root");
        } else {
            System.out.println("The equation has no roots");
        } 
    }
}

// ax + b = c --> x = (c - b) / a

import java.util.Scanner;

public class LinearEquation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ax + b = c");
        System.out.print("Enter the value a: ");
        int a = input.nextInt();
        System.out.print("Enter the value b: ");
        int b = input.nextInt();
        System.out.print("Enter the value c: ");
        int c = input.nextInt();

        if(a == 0) {
            System.out.println("The equation has no unique solution");
        } else {
            double result = (double) (c - b) / a;
            System.out.printf("%dx + %d = %d%n", a, b, c);
            System.out.printf("x = %.2f%n", result);
        }
    }
}

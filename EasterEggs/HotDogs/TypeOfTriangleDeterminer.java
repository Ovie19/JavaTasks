// equilateral -- all sides are equal
// scalene -- two sides are equal
// isosceles -- no sides are equal

import java.util.Scanner;

public class TypeOfTriangleDeterminer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int side1 = input.nextInt();
        System.out.print("Enter second side: ");
        int side2 = input.nextInt();
        System.out.print("Enter third side: ");
        int side3 = input.nextInt();

        if(side1 == side2 && side2 == side3) {
            System.out.println("This is an equilateral triangle");
        } else if(side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("This is a scalene triangle");
        } else {
            System.out.println("This is an isosceles triangle");
        }

        int sumOfSide1AndSide2 = side1 + side2;
        int sumOfSide1AndSide3 = side1 + side3;
        int sumOfSide2AndSide3 = side2 + side3;

        if(sumOfSide1AndSide2 > side3) {
            System.out.println("This is a valid triangle");
        } else if(sumOfSide1AndSide3 > side2) {
            System.out.println("This is a valid triangle");
        } else if(sumOfSide2AndSide3 > side1) {
            System.out.println("This is a valid triangle");
        } else {
            System.out.println("This is an invalid triangle");
        } 
    }
}

// Perimeter = 2(L + B)

import java.util.Scanner;

public class PerimeterOfRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the triangle: ");
        int length = input.nextInt();
        System.out.print("Enter the breadth of the triangle: ");
        int breadth = input.nextInt();
        
        if(length != breadth) {
            int perimeter = (length + breadth) * 2;
            System.out.printf("The perimeter of the rectangle is %d%n", perimeter);
        } else {
            System.out.println("The inputs are invalid");
        }
    }
}

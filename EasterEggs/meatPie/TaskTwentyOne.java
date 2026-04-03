import java.util.Scanner;

public class TaskTwentyOne {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = inputCollector.nextInt();

        System.out.print("Enter the height: ");
        int height = inputCollector.nextInt();

        double area = 0.5 * base * height;
        System.out.printf("The area of the triangle is %.2f%n", area);
    }
}


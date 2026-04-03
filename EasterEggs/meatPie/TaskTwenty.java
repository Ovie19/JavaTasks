import java.util.Scanner;

public class TaskTwenty {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = inputCollector.nextInt();

        System.out.print("Enter the width: ");
        int width = inputCollector.nextInt();

        int area = length * width;
        System.out.printf("The area is %d%n", area);
    }
}



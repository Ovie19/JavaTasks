import java.util.Scanner;

public class NonDecreasingOrderDisplayer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int value1 = input.nextInt();
        System.out.print("Enter second number: ");
        int value2 = input.nextInt();
        System.out.print("Enter third number: ");
        int value3 = input.nextInt();

        if (value1 > value2) {
            int temporaryValue = value1;
            value1 = value2;
            value2 = temporaryValue;
        }

        if (value2 > value3) {
            int temporaryValue = value2;
            value2 = value3;
            value3 = temporaryValue;
        }

        // Reiterate
        if (value1 > value2) {
            int temporaryValue = value1;
            value1 = value2;
            value2 = temporaryValue;
        }

        if (value2 > value3) {
            int temporaryValue = value2;
            value2 = value3;
            value3 = temporaryValue;
        }

        System.out.printf("%d, %d, %d%n", value1, value2, value3);
    }
}

// 1 , 2, 3, 4
// x - 3, 2, 1

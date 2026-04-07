import java.util.Scanner;

public class summationOneToN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();
        int result = number * (number + 1) / 2;
        // It gives the summation from 1 to number

        System.out.printf("The summation from %d to 1 is %d%n", number,
            summation);
    }
}

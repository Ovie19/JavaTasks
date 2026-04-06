// 1 + 2 + 3 + ... + n = n(n+1) / 2

import java.util.Scanner;

public class summationOneToN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();
        int summation = number * (number + 1) / 2;

        System.out.printf("The summation from %d to 1 is %d%n", number,
            summation);
    }
}

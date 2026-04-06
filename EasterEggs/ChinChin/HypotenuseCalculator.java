// hyp = sqrt(opp^2 + adj^2)

import java.util.Scanner;

public class HypotenuseCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the opposite side: ");
        int opposite = input.nextInt();
        System.out.print("Enter the adjacent side: ");
        int adjacent = input.nextInt();

        double hypotenuse = Math.sqrt((opposite * opposite) + (adjacent * adjacent));
        System.out.printf("The hypotenuse is %.2f%n", hypotenuse);
    }
}

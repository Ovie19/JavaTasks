import java.util.Scanner;

public class NumberRangeDeterminer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 10 && number < 100) {
            System.out.println("It is between 10 and 100. Exclusive of both endpoints");
        } else {
            System.out.println("It is not between 10 and 100. Exclusive of both endpoints");
        }
    }
}

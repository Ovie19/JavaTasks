import java.util.Scanner;

public class CountDown {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        for (int index = number; index >= 1; index--) {
            System.out.println(index);
        }
        System.out.println("Blast off!");
    }
}

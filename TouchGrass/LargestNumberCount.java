import java.util.Scanner;

public class LargestNumberCount {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number (Enter 0 to quit): ");
        int number = inputCollector.nextInt();
        int largest = number;
        int count = 0;

        while (number != 0) {
            if (number > largest) {
                largest = number;
                count = 1;
            } else if (number == largest) {
                count++;
            }

            System.out.print("Enter a number (Enter 0 to quit): ");
            number = inputCollector.nextInt();
        }

        System.out.println("The largest number is " + largest);
        System.out.println("It occured " + count + " times");
    }
}

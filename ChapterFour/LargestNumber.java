import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;

        for(int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter number of units: ");
            int number = inputCollector.nextInt();

            if (number > largest)
                largest = number;
        }

        System.out.println("The largest number is " + largest);
    }
}
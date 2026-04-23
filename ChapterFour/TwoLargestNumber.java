import java.util.Scanner;

public class TwoLargestNumber {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        int largestNumber = number;
        int secondLargestNumber = number;

        for (int count = 1; count <= 9; count++) {
            System.out.print("Enter a number: ");
            number = inputCollector.nextInt();

            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = number;
            }
            else if (number > secondLargestNumber)
                secondLargestNumber = number;
        }

        System.out.println("The largest number is " + largestNumber);
        System.out.println("The second largest number is " + secondLargestNumber);
    }
}
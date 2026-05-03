import java.util.Scanner;

public class EvenAndOddNumberCounter {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        for(int index = 1; index <= 10; index++) {
            System.out.print("Enter number " + index + ": ");
            int number = inputCollector.nextInt();

            if(number % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
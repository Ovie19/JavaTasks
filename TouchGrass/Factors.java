import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        for (int index = 1; index <= number / 2; index++) {
            if (number % index == 0)
                System.out.println(index);
        }
        System.out.println(number);
    }
}

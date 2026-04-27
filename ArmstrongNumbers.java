import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        boolean isArmstrongNumberResult = isArmstrongNumber(number);

        if (isArmstrongNumberResult)
            System.out.println(number + " is an amstrong number.");
        else
            System.out.println(number + " is not an amstrong number.");
    }

    public static boolean isArmstrongNumber(int number) {
        if (number < 0)
            return false;

        int oldNumber = number;
        String numberString = number + "";
        int numberLength = numberString.length();
        int total = 0;

        while (number > 0) {
            int remainder = number % 10;
            total += (int) Math.pow(remainder, numberLength);
            number /= 10;
        }

        return oldNumber == total;
    }
}

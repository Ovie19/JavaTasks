import java.util.Scanner;

public class StringFormat {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inputCollector.nextInt();

        System.out.print("Enter width: ");
        int width = inputCollector.nextInt();

        System.out.println(format(number, width));
    }

    public static String format(int number, int width) {
        String formatString = "%0" + width + "d";

        return String.format(formatString, number);
    }
}
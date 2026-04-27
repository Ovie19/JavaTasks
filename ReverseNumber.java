public class ReverseNumber {

    public static void main(String[] args) {
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        String result = "";

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        while (number > 0) {
            int digit = number % 10;
            int square = digit * digit;
            result = square + "\n" + result;
            number /= 10;
        }

        System.out.println(result);
    }
}

public class PiApproximation {
    public static void main(String... args) {
        System.out.println("Number   Pi Approx");
        for(int index = 1;  index < 1000; index += 100) {
            System.out.printf("%-6d%11f%n", index, m(index));
        }
    }

    public static double m(int i) {
        double summation = 0;

        for(int index = 1; index <= i; index++) {
            summation += Math.pow(-1, index + 1) / (2 * index - 1);
        }

        return 4 * summation;
    }
}
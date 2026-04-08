public class ProductOfInteger {

    public static void main(String[] args) {

        int product = 1;
        int counter = 1;

        while(counter <= 10) {
            product *= counter;
            counter++;
        }

        System.out.printf("The product of 1 to 10 is %d%n", product);
    }
}

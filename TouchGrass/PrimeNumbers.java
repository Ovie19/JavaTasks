public class PrimeNumbers {

    public static void main(String[] args) {
        int count = 0;

        for (int number = 2; number <= 1200; number++) {
            boolean isPrime = true;

            for (int divisor =  2; divisor * divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.printf("%4d ", number);
                count++;
                if (count % 8 == 0)
                    System.out.println();
            }
        }

        System.out.println();
    }
}

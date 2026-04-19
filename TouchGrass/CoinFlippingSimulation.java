import java.util.Random;

public class CoinFlippingSimulation {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int headsCount = 0;
        int tailsCount = 0;

        for (int index = 1; index <= 1000000; index++) {
            int coinTossValue = randomNumberGenerator.nextInt(2);

            if (coinTossValue == 0)
                headsCount++;
            else
                tailsCount++;
        }

        System.out.println("The number of heads is " + headsCount);
        System.out.println("The number of tails is " + tailsCount);
    }
}

import java.util.Random;

public class DifferenceBetweenSingleDigits {

    public static void main(String[] args) {

        Random random = new Random();

        int firstNumber = random.nextInt(9) + 1;
        int secondNumber = random.nextInt(9) + 1;

        if(firstNumber > secondNumber) {
            System.out.printf("%d - %d = %d%n", firstNumber, secondNumber,
               (firstNumber - secondNumber));
        } else {
            System.out.printf("%d - %d = %d%n", secondNumber, firstNumber,
               (secondNumber - firstNumber));
        }
    }
}

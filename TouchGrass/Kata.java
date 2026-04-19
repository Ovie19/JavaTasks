public class Kata {
    public static int maximum(int firstNumber, int secondNumber) {
        int maximum = firstNumber;

        if (secondNumber > maximum)
            maximum = secondNumber;

        return maximum;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0)
            return true;

        return false;
    }

    public static boolean isPrimeNumber(int number) {
        for (int index = 2; index * index < number; index++) {
            if (number % index == 0)
                return false;
        }

        return true;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return (int) Math.abs(firstNumber - secondNumber);
    }

    public static int divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0)
            return 0;

        return firstNumber / secondNumber;
    }

    public static int factorOf(int number) {
        int count = 0;

        for (int index = 1; index <= number / 2; index++) {
            if (number % index == 0)
                count++;
        }

        return count + 1;
    }

    public static boolean isPerfectSquare(int number) {
        double squareRootOfNumber = Math.sqrt(number);
        int castedSquareRootOfNumber = (int) squareRootOfNumber;

        return squareRootOfNumber == castedSquareRootOfNumber;
    }

    public static boolean isPalindrome(int number) {
        int fifthDigit = number % 10;
        number /= 10;
        int fourthDigit = number % 10;
        number /= 10;
        int thirdDigit = number % 10;
        number /= 10;
        int secondDigit = number % 10;
        number /= 10;
        int firstDigit = number % 10;

        if (fifthDigit != firstDigit || fourthDigit != secondDigit)
            return false;

        return true;
    }

    public static long factorialOf(int number) {
        long factorial = 1;

        for (int index = number; index > 1; index--) {
            factorial *= index;
        }

        return factorial;
    }

    public static long squareOf(int number) {
        return number * number;
    }
}
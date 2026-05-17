
public class Mode {
    public static int getNumberOfMostOccuringDigits(int[] numbers) {
        int count = 0;
        int maxCount = 0;
        int currentNumber = numbers[0];

        for(int number: numbers) {
            if(currentNumber == number)
                count++;
            else {
                currentNumber = number;
                count = 1;
            }

            if(count > maxCount)
                maxCount = count;
        }

        return maxCount;
    }
}
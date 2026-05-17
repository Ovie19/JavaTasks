import java.util.*;

public class ReoccuringNumbers {
    public static int[] getOccuringNumbers(int[] numbers) {
        List<Integer> occuringNumbers = new ArrayList<Integer>();
        for(int number: numbers) {
            int count = 0;

            for(int value: numbers) {
                if (value == number)
                    count++;
            }

            if (count > 1 && !occuringNumbers.contains(number))
                occuringNumbers.add(number);
        }

        int[] occuringNumbersArray = new int[occuringNumbers.size()];
        int count = 0;

        for(Integer number: occuringNumbers) {
            occuringNumbersArray[count++] = number;
        }

        return occuringNumbersArray;
    }
}
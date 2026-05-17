public class RangeCalculator {

    public static int range(int[] numbers) {

        int minimum = numbers[0];
        int maximum = numbers[0];

        for(int number: numbers) {

            if (number > maximum)
                maximum = number;

            if (number < minimum)
                minimum = number;
        }


        return maximum - minimum;
    }
}
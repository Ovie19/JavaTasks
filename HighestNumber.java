public class HighestNumber {
    public static void main(String[] args) {
        int highestNumber = highestOf(4, 12);
        System.out.println("The highest number of 4, 12 is " + highestNumber);

        highestNumber = highestOf(24, 12, 54);
        System.out.println("The highest number of 24, 12, 54 is " + highestNumber);

        highestNumber = highestOf(24, 12, 54, 11);
        System.out.println("The highest number of 24, 12, 54, 11 is " + highestNumber);

        highestNumber = highestOf(24, 12, 14, 11, 31);
        System.out.println("The highest number of 24, 12, 14, 11, 31 is " + highestNumber);

        highestNumber = highestOf(24, 12, 94, 11, 31, 91);
        System.out.println("The highest number of 24, 12, 94, 11, 31, 91 is " + highestNumber);

        highestNumber = highestOf(24, 12, 94, 11, 31, 43, 76, 98, 101);
        System.out.println("The highest number of 24, 12, 94, 11, 31, 43, 76, 98, 101 is " + highestNumber);
    }

    public static int highestOf(int... numbers) {
        int highest = numbers[0];

        for(int index = 1; index < numbers.length; index++)
            if (numbers[index] > highest)
                highest = numbers[index];

        return highest;
    }
}

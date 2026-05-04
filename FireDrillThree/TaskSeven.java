public class TaskSeven {
    public static int[] getOddIndexedArray(int[] numbers) {
        int size = numbers.length / 2;
        int[] oddIndexedArray = new int[size];
        int count = 0;

        for(int index = 1; index < numbers.length; index += 2) {
            oddIndexedArray[count++] = numbers[index];
        }

        return oddIndexedArray;
    }

    public static int sum(int[] oddIndexedArray) {
        int sum = 0;

        for(int number: oddIndexedArray)
            sum += number;

        return sum;
    }
}
public class TaskFive {
    public static int[] getOddIndexedArray(int[] numbers) {
        int size = numbers.length / 2;
        int[] oddIndexedArray = new int[size];
        int count = 0;

        for(int index = 1; index < numbers.length; index += 2) {
            oddIndexedArray[count++] = numbers[index];
        }

        return oddIndexedArray;
    }
}
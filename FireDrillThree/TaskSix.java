public class TaskSix {
    public static int[] getEvenIndexedArray(int[] numbers) {
        int size = (numbers.length + 1) / 2;
        int[] evenIndexedArray = new int[size];
        int count = 0;

        for(int index = 0; index < numbers.length; index += 2) {
            evenIndexedArray[count++] = numbers[index];
        }

        return evenIndexedArray;
    }

    public static int sum(int[] evenIndexedArray) {
        int sum = 0;

        for(int number: evenIndexedArray)
            sum += number;

        return sum;
    }
}
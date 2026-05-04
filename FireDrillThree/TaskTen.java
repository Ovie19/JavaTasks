public class TaskTen {
    public static int[] getEvenIndexedArray(int[] numbers) {
        int size = (numbers.length + 1) / 2;
        int[] evenIndexedArray = new int[size];
        int count = 0;

        for(int index = 0; index < numbers.length; index += 2) {
            evenIndexedArray[count++] = numbers[index];
        }

        return evenIndexedArray;
    }

    public static int maximum(int[] evenIndexedArray) {
        int maximum = evenIndexedArray[0];

        for(int index = 1; index < evenIndexedArray.length; index++) {
            if(evenIndexedArray[index] > maximum)
                maximum = evenIndexedArray[index];
        }

        return maximum;
    }
}
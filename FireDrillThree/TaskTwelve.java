public class TaskTwelve {
    public static int[] swapElements(int[] numbers) {
        for(int index = 1; index < numbers.length; index += 2) {
            int temp = numbers[index];
            numbers[index] = numbers[index - 1];
            numbers[index - 1] = temp;
        }

        return numbers;
    }
}
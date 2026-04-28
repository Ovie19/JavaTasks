import java.util.Arrays;

public class ArraySnacks {
    public static void main(String[] args) {
        int[] numbers = {12, 2, 11, 23, 17};

        int largestNumber = getLargest(numbers);
        System.out.println("The largest number in the array is " + largestNumber);

        int[] reversedArray = reverse(numbers);
        System.out.println("\nOriginal Array => " + Arrays.toString(numbers));
        System.out.println("Reversed Array => " + Arrays.toString(reversedArray));

        boolean isFiveInArray = contains(5, numbers);
        System.out.println("\nFive is in the array => " + isFiveInArray);
        boolean isElevenInArray = contains(11, numbers);
        System.out.println("Eleven is in the array => " + isElevenInArray);

        System.out.println("\nArray elements in odd position");
        printOddPositionsInArray(numbers);

        System.out.println("\n\nArray elements in even position");
        printEvenPositionsInArray(numbers);

        int total = getTotalOfArrayValues(numbers);
        System.out.println("\n\nThe value of the total elements in the arrays is " + total);

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        int[] newArray = concatenate(firstArray, secondArray);
        System.out.println("New Array => " + Arrays.toString(newArray));

        newArray = concatenateAlternatively(firstArray, secondArray);
        System.out.println("Alternative Array => " + Arrays.toString(newArray));
    }

    public static int getLargest(int[] numbers) {
        int largest = numbers[0];

        for (int number: numbers) {
            if (number > largest)
                largest = number;
        }

        return largest;
    }

    public static int[] reverse(int[] numbers) {
        int[] reversedArray = new int[numbers.length];
        int count = 0;

        for(int index = numbers.length - 1; index >= 0; index--) {
            reversedArray[count] = numbers[index];
            count++;
        }

        return reversedArray;
    }

    public static boolean contains(int numberToCheck, int[] numbers) {
        for(int number: numbers) {
            if (number == numberToCheck)
                return true;
        }

        return false;
    }

    public static void printOddPositionsInArray(int[] numbers) {
        for(int index = 0; index < numbers.length; index++) {
            if (index % 2 != 0)
                System.out.print(numbers[index] + " ");
        }
    }

    public static void printEvenPositionsInArray(int[] numbers) {
        for(int index = 0; index < numbers.length; index++) {
            if (index % 2 == 0)
                System.out.print(numbers[index] + " ");
        }
    }

    public static int getTotalOfArrayValues(int[] numbers) {
        int total = 0;

        for(int number: numbers)
            total += number;

        return total;
    }

//    public static boolean isPalindrome(String word) {
//        char[] letters = new char[word.length()];
//
//
//    }

    public static int sumOfNumbersUsingForLoop(int[] numbers) {
        int sum = 0;

        for(int index = 0; index < numbers.length; index++)
            sum += numbers[index];

        return sum;
    }

    public static int sumOfNumbersUsingWhileLoop(int[] numbers) {
        int sum = 0;
        int index = 0;

        while(index < numbers.length) {
            sum += numbers[index];
            index++;
        }

        return sum;
    }

    public static int sumOfNumbersUsingDoWhileLoop(int[] numbers) {
        int sum = 0;
        int index = 0;

        do {
            sum += numbers[index];
            index++;
        } while(index < numbers.length);

        return sum;
    }

    public static int[] concatenate(int[] firstArray, int[] secondArray) {
        int totalArrayLength = firstArray.length + secondArray.length;
        int[] newArray = new int[totalArrayLength];
        int count = 0;

        for(int index = 0; index < firstArray.length; index++)
            newArray[count++] = firstArray[index];

        for(int index = 0; index < secondArray.length; index++)
            newArray[count++] = secondArray[index];

        return newArray;
    }

    public static int[] concatenateAlternatively(int[] firstArray, int[] secondArray) {
        int totalArrayLength = firstArray.length + secondArray.length;
        int[] newArray = new int[totalArrayLength];
        int count = 0;

        for(int index = 0; index < firstArray.length; index++) {
            newArray[count++] = firstArray[index];
            newArray[count++] = secondArray[index];
        }

        return newArray;
    }
}
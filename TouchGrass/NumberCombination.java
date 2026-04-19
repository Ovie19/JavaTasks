public class NumberCombination {
    public static void main(String[] args) {
        int count = 0;

        for(int index = 1; index <= 7; index++) {
            for (int innerIndex = 1; innerIndex <= 7; innerIndex++) {
                System.out.printf("%d%d ", index, innerIndex);
                count++;

                if (count % 10 == 0)
                    System.out.println();
            }
        }

        System.out.println("\nThe total count is " + count);
    }
}
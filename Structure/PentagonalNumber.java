public class PentagonalNumber {
    public static void main(String[] args) {
        for(int index = 1; index <= 100; index++) {
            int pentagonalNumber = getPentagonalNumber(index);
            System.out.printf("%7d", pentagonalNumber);

            if(index % 10 == 0)
                System.out.println();
        }
    }

    public static int getPentagonalNumber(int number) {
        return number * (3 * number - 1) / 2;
    }
}
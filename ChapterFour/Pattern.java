public class Pattern {

    public static void main(String[] args) {

        for (int rowCount = 1; rowCount <= 8; rowCount++) {
            if (rowCount % 2 == 0)
                System.out.print(" ");

            for (int columnCount = 1; columnCount <= 8; columnCount++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
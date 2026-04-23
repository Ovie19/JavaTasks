public class TabularOutput {

    public static void main(String[] args) {

        System.out.println("N\tN2\tN3\tN4");
        for(int index = 1; index <= 5; index++) {
            System.out.printf("%d\t%d\t%d\t%d%n", index, (int) Math.pow(index, 2),
                (int) Math.pow(index, 3), (int) Math.pow(index, 4));
        }
    }
}
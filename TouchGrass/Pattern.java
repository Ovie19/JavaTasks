public class Pattern {
    public static void main(String[] args) {
        for (int index = 7; index >= 0; index--) {
            if (index == 0) {
                for (int innerIndex = 2; innerIndex <= 7; innerIndex++) {
                    System.out.print(innerIndex + " ");
                }
            } else {
                System.out.print(index + " ");
            }
        }
        System.out.println();
    }
}

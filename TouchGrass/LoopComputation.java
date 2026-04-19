public class LoopComputation {
    public static void main(String[] args) {
        double total = 0;

        for (int index = 1; index <= 99; index += 2) {
            double division = (double) index / (index + 2);
            total += division;
        }

        System.out.println("The total is " + total);
    }
}

public class EvenNumber {
    public static void main(String... args) {
        int count = 0;
        for(int index = 1; index <= 100; index++) {
            if(index % 2 == 0) {
                System.out.printf("%3d ", index);
                count++;
            }

            if (count % 10 == 0)
                System.out.println();
        }
    }
}
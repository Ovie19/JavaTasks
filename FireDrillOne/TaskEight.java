public class TaskEight {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                for (int j = 1; j <= 5; j++) {
                    sum += Math.pow(i, j);
                } 
            }
        }

        System.out.println(sum);
    }
}

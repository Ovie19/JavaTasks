public class TaskSeven {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                int sum = 0;
                for (int j = 1; j <= 5; j++) {
                    sum += Math.pow(i, j);
                } 
                System.out.print(sum + " "); 
            }
        }
        System.out.println();
    }
}

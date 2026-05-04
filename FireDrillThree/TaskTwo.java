import java.util.Scanner;

public class TaskTwo {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);
        int[] scores = new int[10];

        for(int index = 0; index < scores.length; index++) {
            System.out.print("Enter score: ");
            scores[index] = inputCollector.nextInt();
        }

        for(int score: scores)
            System.out.println(score);
    }
}
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int sum = 0;
        
        for (int counter = 1; counter <= 10; counter++) {
            System.out.printf("Enter score %d: ", counter);
            int score = inputCollector.nextInt();
            if (score % 2 == 0)
                sum += score;
        }
                
        System.out.println("\nThe total score of the even scores is " + sum);
    }
}

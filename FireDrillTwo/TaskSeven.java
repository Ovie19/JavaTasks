import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int sum = 0;
        int evenCounter = 0;
        
        for (int counter = 1; counter <= 10; counter++) {
            System.out.printf("Enter score %d: ", counter);
            int score = inputCollector.nextInt();
            if (score % 2 == 0) {
                sum += score;
                evenCounter++;
            }
        }
                
        double average = (double) sum / evenCounter;
        System.out.println("\nThe total score of the even scores is " + sum);
        System.out.println("The average score of the even scores is " + average);
    }
}

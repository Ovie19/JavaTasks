import java.util.Scanner;

public class TaskSix {
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
        System.out.println("\nThe average score of the even scores is " + average);
    }
}

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int sum = 0;
        int validScoreCounter = 0;
        
        for( ; validScoreCounter < 10; ) {
            System.out.print("Enter score: ");
            int score = inputCollector.nextInt();
            
            if (score >= 0 && score <= 100) {
                sum += score;
                validScoreCounter++;
            }
        }
                
        System.out.println("\nThe total of the valid scores is " + sum);
    }
}

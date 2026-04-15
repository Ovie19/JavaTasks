import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int sum = 0;
        int validScoreCounter = 0;
        
        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter score: ");
            int score = inputCollector.nextInt();
            
            if (score >= 0 && score <= 100) {
                sum += score;
                validScoreCounter++;
            }
        }      
                
        double average = (double) sum / validScoreCounter;
        System.out.println("\nThe average of the valid scores is " + average);
    }
}

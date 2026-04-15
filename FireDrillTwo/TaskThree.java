import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int sum = 0;
        
        for (int counter = 1; counter <= 10; counter++) {
            System.out.printf("Enter score %d: ", counter);
            int score = inputCollector.nextInt();
            sum += score;
        }
        
        double average = (double) sum / 10;
        
        System.out.println("\nThe total score is " + sum);
        System.out.println("The average score is " + average);
    }
}

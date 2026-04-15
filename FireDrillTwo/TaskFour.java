import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int sum = 0;
        
        for (int counter = 1; counter <= 10; counter++) {
            System.out.printf("Enter score %d: ", counter);
            int score = inputCollector.nextInt();
            if (counter % 2 == 0)
                sum += score;
        }
                
        System.out.println("\nThe total score of the even indexes is " + sum);
    }
}

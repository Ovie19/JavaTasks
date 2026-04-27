// Collect Integer
// Add all digits 
import java.util.Scanner;

public class ImpromptuTask {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        
        String numberString = "" + number;
        int sum = 0;
        
        for (int counter = 0; counter < numberString.length(); counter++) {
            sum += Integer.parseInt(numberString.charAt(counter) + "");
        }
        
        System.out.println(sum);
    }
}

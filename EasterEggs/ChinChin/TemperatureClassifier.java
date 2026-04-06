import java.util.Scanner;

public class TemperatureClassifier {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        int temperature = input.nextInt();

        if(temperature < 0) {
            System.out.println("Freezing");
        } else if(temperature <= 15) {
            System.out.println("Cold");
        } else if(temperature <= 25) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
    }
}

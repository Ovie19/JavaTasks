import java.util.Scanner;

public class ThiefCatcher {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);
        String userInput;

//        System.out.println("   T h i e f   ".trim().replace(" ", ""));

        do {
            System.out.print("Enter thief if this is the person: ");
            userInput = inputCollector.nextLine();
            userInput = userInput.trim().toLowerCase();
        } while(!userInput.contains("thief"));
    }
}
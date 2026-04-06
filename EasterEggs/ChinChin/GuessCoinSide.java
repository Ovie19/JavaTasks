import java.util.Scanner;
import java.util.Random;

public class GuessCoinSide {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int coinSide = random.nextInt(2);

        System.out.print("0. Heads\n1. Tails\nEnter your choice: ");
        int userChoice = input.nextInt();

        if(userChoice != 0 && userChoice != 1) {
            System.out.println("Invalid response.");
            return;
        }

        if(coinSide == userChoice) {
            System.out.println("You guessed right!");
        } else {
            System.out.println("You guessed wrong!");
        } 
    }
}

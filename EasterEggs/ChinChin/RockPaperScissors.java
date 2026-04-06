// RockPaperScissors (Scissor - 0, Rock - 1, Paper - 2)
// Paper beats Rock
// Rock beats Scissors
// Scissor beats Paper

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int computerPick = random.nextInt(3);

        System.out.print("0. Scissors\n1. Rock\n2. Paper\nEnter your choice: ");
        int userChoice= input.nextInt();

        if(userChoice != 0 && userChoice != 1 && userChoice != 2) {
            System.out.println("Invalid response.");
            return;
        }

        if(computerPick == 0) {
            if(userChoice == 0) {
                System.out.println("Computer picks Scissors");
                System.out.println("Draw!");
            } 
            if(userChoice == 1) {
                System.out.println("Computer picks Scissors");
                System.out.println("You win!");
            } 
            if(userChoice == 2) {
                System.out.println("Computer picks Scissors");
                System.out.println("Computer wins!");
            } 
        } else if(computerPick == 1) {
            if(userChoice == 0) {
                System.out.println("Computer picks Rock");
                System.out.println("Computer wins!");
            } 
            if(userChoice == 1) {
                System.out.println("Computer picks Rock");
                System.out.println("Draw!");
            } 
            if(userChoice == 2) {
                System.out.println("Computer picks Rock");
                System.out.println("You win!");
            } 
        } else {
            if(userChoice == 0) {
                System.out.println("Computer picks Paper");
                System.out.println("You win!");
            } 
            if(userChoice == 1) {
                System.out.println("Computer picks Paper");
                System.out.println("Computer wins!");
            } 
            if(userChoice == 2) {
                System.out.println("Computer picks Paper");
                System.out.println("Draw!");
            } 
        }
    }
}

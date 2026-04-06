import java.util.Scanner;
import java.util.Random;

public class Lottery {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int lotteryNumber = random.nextInt(100);

        System.out.println(lotteryNumber);
        System.out.print("Enter your lucky number (0 - 99): ");
        int userLuckyNumber = input.nextInt();

        int firstLotteryDigit = lotteryNumber % 10;
        int secondLotteryDigit = lotteryNumber / 10;

        int firstUserLotteryDigit = userLuckyNumber % 10;
        int secondUserLotteryDigit = userLuckyNumber / 10;

        System.out.printf("The lottery number is: %02d%n",  lotteryNumber);
        if(lotteryNumber == userLuckyNumber) {
            System.out.println("Congratulations!!!\nYou have won $10000");
        } else if(firstLotteryDigit + secondLotteryDigit == 
                firstUserLotteryDigit + secondUserLotteryDigit) {
            System.out.println("Congratulations!!!\nYou have won $3000");
        } else if (firstLotteryDigit == firstUserLotteryDigit || 
                firstLotteryDigit == secondUserLotteryDigit ||
                secondLotteryDigit == firstUserLotteryDigit ||
                secondLotteryDigit == secondUserLotteryDigit) {
            System.out.println("Congratulations!!!\nYou have won $1000");
        } else {
            System.out.println("Try again!!!");
        }
    }
}

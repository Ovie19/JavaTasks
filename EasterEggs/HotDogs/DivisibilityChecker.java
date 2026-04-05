import java.util.Scanner;

public class DivisibilityChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if(number % 2 == 0) {
            System.out.println("It is divisible by 2");
        } else {
            System.out.println("It is not divisible by 2");
        } 

        if(number % 3 == 0) {
            System.out.println("It is divisible by 3");
        } else {
            System.out.println("It is not divisible by 3");
        } 

        if(number % 5 == 0) {
            System.out.println("It is divisible by 5");
        } else {
            System.out.println("It is not divisible by 5");
        } 

        if(number % 7 == 0) {
            System.out.println("It is divisible by 7");
        } else {
            System.out.println("It is not divisible by 7");
        } 
    }
}

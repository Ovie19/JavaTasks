import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = inputScanner.nextInt();

        System.out.printf("You are %d years old.%n", age);
    }
}

import java.util.Scanner;

public class TaskTwentySix {

    public static void main(String[] args) {
    
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = inputCollector.nextLine();

        System.out.print("Enter your age: ");
        int age = inputCollector.nextInt();

        System.out.printf("I am %s and I am %d years old.%n", name, age);
    }
}



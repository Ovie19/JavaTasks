import java.util.Scanner;

public class HiFiveEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if(number % 5 == 0) {
            System.out.println("HiFive");
        } else if(number % 2 == 0) {
            System.out.println("HiEven");
        } else {
            System.out.println("Not divisible by 5 or 2");
        }
    }
}

import java.util.Scanner;

public class CompareTensAndUnit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a two-digit integer: ");
        int number = input.nextInt();

        int unit = number % 10;
        number /= 10;
        int tens = number % 10;

        if(tens > unit) {
            System.out.println("Tens digit is greater than unit digit");
        } else if(tens < unit) {
            System.out.println("Tens digit is lesser than unit digit");
        } else {
            System.out.println("Tens digit is equal to unit digit");
        } 
    }
}

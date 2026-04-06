import java.util.Scanner;

public class DivisionByZeroChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = input.nextInt();
        System.out.print("Enter n: ");
        int n = input.nextInt();
        
        if(n != 0) {
            int result = m / n;
            System.out.printf("%d / %d = %d%n", m, n, result);
        } else {
            System.out.println("Error: you cannot divide by 0");
        }
    }
}

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = inputCollector.nextLine();

        boolean isValidPassword = isValidPassword(password);
        if(isValidPassword)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }

    public static boolean isValidPassword(String password) {
        if(password.length() < 10)
            return false;

        int digitsCount = 0;
        for(int index = 0; index < password.length(); index++) {
            int asciiValue = (int) password.charAt(index);
            if(asciiValue < 47 || asciiValue >= 127 || asciiValue >= 58 && asciiValue <= 64 ||
                asciiValue >= 58 && asciiValue <= 64)
                return false;

            if(asciiValue >= 48 && asciiValue <= 57)
                digitsCount++;
        }

        return digitsCount >= 3;
    }
}
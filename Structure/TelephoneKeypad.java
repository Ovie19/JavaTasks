import java.util.Scanner;

public class TelephoneKeypad {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter phone number string: ");
        String phoneNumber = inputCollector.nextLine().toUpperCase();

        for(int index = 0; index < phoneNumber.length(); index++) {
            System.out.print(getNumber(phoneNumber.charAt(index)));
        }
        System.out.println();
    }

    public static int getNumber(char uppercaseLetter) {
        switch(uppercaseLetter) {
            case 'A': case 'B': case 'C':
                return 2;
            case 'D': case 'E': case 'F':
                return 3;
            case 'G': case 'H': case 'I':
                return 4;
            case 'J': case 'K': case 'L':
                return 5;
            case 'M': case 'N': case 'O':
                return 6;
            case 'P': case 'Q': case 'R': case 'S':
                return 7;
            case 'T': case 'U': case 'V':
                return 8;
            case 'W': case 'X': case 'Y': case 'Z':
                return 9;
            default:
                return 0;
        }
    }
}
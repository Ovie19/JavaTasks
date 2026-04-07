import java.util.Scanner;

public class DisplayNumberInWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1 - 10): ");
        int number = input.nextInt();

        switch(number) {
            case 1:
                System.out.println("$1 --> one dollar");
                break;
            case 2:
                System.out.println("$2 --> two dollars");
                break;
            case 3:
                System.out.println("$3 --> three dollars");
                break;
            case 4:
                System.out.println("$4 --> four dollars");
                break;
            case 5:
                System.out.println("$5 --> five dollars");
                break;
            case 6:
                System.out.println("$6 --> six dollars");
                break;
            case 7:
                System.out.println("$7 --> seven dollars");
                break;
            case 8:
                System.out.println("$8 --> eight dollars");
                break;
            case 9:
                System.out.println("$9 --> nine dollars");
                break;
            case 10:
                System.out.println("$10 --> ten dollars");
                break;
            default:
                System.out.println("Invalid response");
        }
    }
}

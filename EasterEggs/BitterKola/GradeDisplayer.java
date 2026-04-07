import java.util.Scanner;

public class GradeDisplayer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade (A, B, C, D, or F): ");
        String grade = input.nextLine();

        switch(grade.toUpperCase()) {
            case "A":
                System.out.println("4.0");
                break;
            case "B":
                System.out.println("3.0");
                break;
            case "C":
                System.out.println("2.0");
                break;
            case "D":
                System.out.println("1.0");
                break;
            case "F":
                System.out.println("0.0");
                break;
            default:
                System.out.println("Invalid Response");
        }
    }
}

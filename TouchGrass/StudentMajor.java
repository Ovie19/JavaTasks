import java.util.Scanner;

public class StudentMajor {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("I = Information Management\nC = Computer Science\nA = Accounting");
        System.out.print("Enter your major: ");
        char studentMajor = inputCollector.nextLine().charAt(0);

        System.out.println("\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior");
        System.out.print("Enter your year: ");
        int studentYear = inputCollector.nextInt();

        String studentFullMajor = "";

        if (studentMajor == 'I')
            studentFullMajor += "Information Management";
        else if (studentMajor == 'C')
            studentFullMajor += "Computer Science";
        else if (studentMajor == 'A')
            studentFullMajor += "Accounting";

        if (studentYear == 1)
            studentFullMajor += " Freshman";
        else if (studentYear == 2)
            studentFullMajor += " Sophomore";
        else if (studentYear == 3)
            studentFullMajor += " Junior";
        else if (studentYear == 4)
            studentFullMajor += " Senior";

        System.out.println("\nYou are a(n) " + studentFullMajor);
    }
}
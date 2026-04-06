import java.util.Scanner;

public class ShippingCostDeterminer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double packageWeight = input.nextDouble();

        if(packageWeight > 0 && packageWeight <= 2) {
            System.out.println("The shipping cost is $2.5");
        } else if(packageWeight > 2 && packageWeight <= 4) {
            System.out.println("The shipping cost is $4.5");
        } else if(packageWeight > 4 && packageWeight <= 10) {
            System.out.println("The shipping cost is $7.5");
        } else if(packageWeight > 10 && packageWeight <= 20) {
            System.out.println("The shipping cost is $10.5");
        } else {
            System.out.println("The package cannot be shipped");
        }
    }
}

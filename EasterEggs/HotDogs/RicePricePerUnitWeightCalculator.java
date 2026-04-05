// Calculates the better price per unit weight of rice

import java.util.Scanner;

public class RicePricePerUnitWeightCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the first rice: ");
        double firstRiceWeight = input.nextDouble();
        System.out.print("Enter the price of the first rice: ");
        double firstRicePrice = input.nextDouble();
        System.out.print("Enter the weight of the second rice: ");
        double secondRiceWeight = input.nextDouble();
        System.out.print("Enter the price of the second rice: ");
        double secondRicePrice = input.nextDouble();

        double firstRicePricePerWeight = firstRicePrice / firstRiceWeight;
        double secondRicePricePerWeight = secondRicePrice / secondRiceWeight;

        if(firstRicePricePerWeight < secondRicePricePerWeight) {
            System.out.println("The first rice has a better price per weight");
        } else {
            System.out.println("The second rice has a better price per weight");
        }
    }
}

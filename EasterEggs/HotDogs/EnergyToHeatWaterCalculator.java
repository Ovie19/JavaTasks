// A program that calculates the amount of energy needed to heat water from initial to final temperature

import java.util.Scanner;

public class EnergyToHeatWaterCalculator {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("To calculate the amount of energy needed to heat water from" +
            " initial to final temperature.");
        System.out.print("Enter value of initial temperature: ");
        double initialTemperature = inputCollector.nextDouble();

        System.out.print("Enter value of final temperature: ");
        double finalTemperature = inputCollector.nextDouble();

        System.out.print("Enter amount of water (Kilogram): ");
        double amountOfWater = inputCollector.nextDouble();

        double amountOfEnergy =  amountOfWater * (finalTemperature - initialTemperature) * 4184;
        
        System.out.printf("%nThe amount of energy needed to heat %.2f kilogram of water" +
            " from an initial temperature of %.2f to a final temperature of %.2f is %.2f%n",
            amountOfWater, initialTemperature, finalTemperature, amountOfEnergy);
    }
}

// Calculate population

// one birth every 7 seconds
// one death every 13 seconds
// one new immigrant every 45 seconds
// current population = 312032486
// new population = current population + birth - death + immigrant

import java.util.Scanner;

public class PopulationCalculator {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int initialPopulation = 312032486;

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int yearsInSeconds = years * 365 * 24 * 60 * 60;
        int birthCount = yearsInSeconds / 7;
        int deathCount = yearsInSeconds / 13;
        int immigrantCount = yearsInSeconds / 45;

        int totalPopulation = initialPopulation + birthCount - deathCount
            + immigrantCount;

        System.out.printf("%nInitial poulation is %d%n", initialPopulation);
        System.out.printf("After %d years, new poulation is %d%n", years, 
            totalPopulation);
    }
}

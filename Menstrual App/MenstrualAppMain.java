import java.util.Scanner;

public class MenstrualAppMain {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        int[] periodCycles = new int[3];

        for(int index = 0; index < 3; index++) {
            System.out.print("Enter period cycle " + (index + 1) + ": ");
            periodCycles[index] = inputCollector.nextInt();
        }
        System.out.print("Enter your period duration: ");
        int periodDuration = inputCollector.nextInt();

        int averagePeriodCycle = MenstrualApp.getAverageCycleLength(periodCycles[0],
            periodCycles[1], periodCycles[2]);
        int ovulationDay = MenstrualApp.getOvulationDay(averagePeriodCycle);
        int[] fertilityWindow = MenstrualApp.getFertilityWindow(ovulationDay);

        // Average Period Cycle
        System.out.println("\nAverage period cycle length is " + averagePeriodCycle + " days.");

        // Safe Periods
        System.out.println("Safe period: Day 1 - " + (fertilityWindow[0] - 1) + " and Day "
            + (fertilityWindow[1] + 1) + " to " + averagePeriodCycle);

        // Fertility window
        System.out.println("Fertile window: Day " + fertilityWindow[0] + " to Day " + fertilityWindow[1]);

        // Ovulation Day
        System.out.println("Ovulation: Day " + ovulationDay);

        // Next Period
        System.out.println("Next Period: Day " + (averagePeriodCycle + 1));
    }
}
public class MenstrualApp {
    public static int getAverageCycleLength(int periodCycleOne, int periodCycleTwo, int periodCycleThree) {
        int totalPeriodCycle = periodCycleOne + periodCycleTwo + periodCycleThree;
        return totalPeriodCycle / 3;
    }

    public static int getOvulationDay(int averageCycleLength) {
        return averageCycleLength - 14;
    }

    public static int[] getFertilityWindow(int ovulationDay) {
        int[] fertilityWindow = new int[2];

        fertilityWindow[0] = ovulationDay - 5;
        fertilityWindow[1] = ovulationDay + 1;

        return fertilityWindow;
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MenstrualAppTest {
    @Test
    public void testThatGetAverageCycleLengthGivesAccurateResult() {
        int periodCycleOne = 31;
        int periodCycleTwo = 29;
        int periodCycleThree = 30;

        int expected = MenstrualApp.getAverageCycleLength(periodCycleOne, periodCycleTwo, periodCycleThree);
        int actual = 30;

        assertEquals(actual, expected);
    }

    @Test
    public void testThatGetOvulationDayGivesAccurateResult() {
        int averagePeriodCycleLength = 30;
        int expected = MenstrualApp.getOvulationDay(averagePeriodCycleLength);
        int actual = 16;

        assertEquals(actual, expected);
    }

    @Test
    public void testThatGetFertilityWindowGivesAccurateResult() {
        int ovulationDay = 16;
        int[] expected = MenstrualApp.getFertilityWindow(ovulationDay);
        int[] actual = {11, 17};

        assertArrayEquals(actual, expected);
    }
}
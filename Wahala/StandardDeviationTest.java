import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardDeviationTest {

    @Test
    public void testThatGetSumOfElementsReturnTheTotalSumOfElementsInAnArray() {
        int[] data = {5, 5, 9, 9, 9, 10, 5, 10, 10};
        int expectedSum = StandardDeviation.getSumOfElements(data);
        int actualSum = 72;
        assertEquals(actualSum, expectedSum);

        int[] elements = {6, 6, 10, 10, 10, 12, 12, 12, 12, 14, 14, 14, 14, 14, 24, 24, 24, 24};
        int expectedSumTwo = StandardDeviation.getSumOfElements(elements);
        int actualSumTwo = 192;
        assertEquals(actualSum, expectedSum);

    }

    @Test
    public void testThatCalculateMeanGivesTheAccurateMeanOfTheElements() {
        int[] data = {5, 5, 9, 9, 9, 10, 5, 10, 10};
        double expectedMean = StandardDeviation.calculateMeanOfElements(data);
        double actualMean = 8.0;
        assertEquals(actualMean, expectedMean, 0.001);

        int[] elements = {6, 6, 10, 10, 10, 12, 12, 12, 12, 14, 14, 14, 14, 14, 24, 24, 24, 24};
        double expectedMeanTwo = StandardDeviation.calculateMeanOfElements(elements);
        double actualMeanTwo = 14.2222;
        assertEquals(actualMeanTwo, expectedMeanTwo, 0.0001);
    }

    @Test
    public void testThatCalculateTotalMeanDeviationReturnsAccurateValue() {
        int[] data = {5, 5, 9, 9, 9, 10, 5, 10, 10};
        double expectedMeanDeviation = StandardDeviation.calculateMeanDeviationOfElements(data);
        double actualMeanDeviation = 42.0;
        assertEquals(actualMeanDeviation, expectedMeanDeviation, 0.001);

        int[] elements = {6, 6, 10, 10, 10, 12, 12, 12, 12, 14, 14, 14, 14, 14, 24, 24, 24, 24};
        double expectedMeanDeviationTwo = StandardDeviation.calculateMeanDeviationOfElements(elements);
        double actualMeanDeviationTwo = 591.1112;
        assertEquals(actualMeanDeviationTwo, expectedMeanDeviationTwo, 0.001);
    }

    @Test
    public void testThatCalculateVarianceGivesTheAccurateValue() {
        int[] data = {5, 5, 9, 9, 9, 10, 5, 10, 10};
        double expectedVariance = StandardDeviation.calculateVarianceOfElements(data);
        double actualVariance = 4.6667;
        assertEquals(actualVariance, expectedVariance, 0.001);


        int[] elements = {6, 6, 10, 10, 10, 12, 12, 12, 12, 14, 14, 14, 14, 14, 24, 24, 24, 24};
        double expectedVarianceTwo = StandardDeviation.calculateVarianceOfElements(elements);
        double actualVarianceTwo = 32.8395;
        assertEquals(actualVarianceTwo, expectedVarianceTwo, 0.001);
    }

    @Test
    public void testThatCalculateStandardDeviationGivesTheActualValue() {
        int[] data = {5, 5, 9, 9, 9, 10, 5, 10, 10};
        double expectedStandardDeviation = StandardDeviation.calculateStandardDeviation(data);
        double actualStandardDeviation = 2.1603;
        assertEquals(actualStandardDeviation, expectedStandardDeviation, 0.001);

        int[] elements = {6, 6, 10, 10, 10, 12, 12, 12, 12, 14, 14, 14, 14, 14, 24, 24, 24, 24};
        double expectedStandardDeviationTwo = StandardDeviation.calculateStandardDeviation(elements);
        double actualStandardDeviationTwo = 5.7306;
        assertEquals(actualStandardDeviationTwo, expectedStandardDeviationTwo, 0.001);
    }


































}
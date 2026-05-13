public class StandardDeviation {

    public static int getSumOfElements(int[] data) {
        int sumOfElements = 0;

        for(int element : data) {
            sumOfElements += element;
        }

        return sumOfElements;
    }

    public static double calculateMeanOfElements(int[] data) {
        int sumOfElements = getSumOfElements(data);

        double mean = (double) sumOfElements / data.length;

        return Math.round(mean * 10000) / 10000.0;
    }

    public static double calculateMeanDeviationOfElements(int[] data) {
        double mean = calculateMeanOfElements(data);

        double totalMeanDeviation = 0;

        for(int element : data) {
            double differenceBetweenElementAndMean = element - mean;
            totalMeanDeviation += differenceBetweenElementAndMean * differenceBetweenElementAndMean;
        }

        return Math.round(totalMeanDeviation * 10000) / 10000.0;
    }

    public static double calculateVarianceOfElements(int[] data) {
        double totalMeanDeviation = calculateMeanDeviationOfElements(data);
        double variance = totalMeanDeviation / data.length;

        return Math.round(variance * 10000) / 10000.0;
    }

    public static double calculateStandardDeviation(int[] data) {
        double variance = calculateVarianceOfElements(data);
        double standardDeviation = Math.sqrt(variance);

        return Math.round(standardDeviation * 10000) / 10000.0;
    }
}
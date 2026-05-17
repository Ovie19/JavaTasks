public class CurrentDate {
    public static void main(String... args) {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        long totalDays = totalHours / 24;
        long currentDay = totalDays % 7;

        long currentYear = 1970 + totalDays / 365;

        System.out.printf("%d, %d %02d:%02d:%02d%n", currentDay, currentYear, currentHour,
            currentMinute, currentSecond);
    }
}
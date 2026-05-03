public class NumberOfDaysInAYear {
    public static void main(String[] args) {
        System.out.println("Years\tDays");
        for(int year = 2014; year <= 2034; year++) {
            System.out.printf("%5d%6d%n", year, numberOfDaysInAYear(year));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return 366;

        return 365;
    }
}
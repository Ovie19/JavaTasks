// i = (p * r * t) / 100
// ci = p(1 + 0.01r)^t - p

public class InterestCalculator {

    public static void main(String[] args) {

        double principal = 10000;
        double rate = 8;
        int years = 3;

        double simpleInterest = (principal * rate * years) / 100;
        double compoundedAmount = principal * Math.pow((1 + rate / 100), years);
        double compoundInterest = compoundedAmount - principal;

        System.out.printf("The simple interest on a prinipal of %.2f, with a rate" +
        " of %.1f over %d years is %.2f%n", principal, rate, years, simpleInterest);
        System.out.printf("The compound interest on a prinipal of %.2f, with a rate" +
        " of %.1f over %d years is %.2f%n", principal, rate, years, compoundInterest);
    }
}

public class CubesOfANumber {

    public static void main(String[] args) {

        System.out.println("The cubes of 1 to 5 are as follows: ");
        for (int counter = 1; counter <= 5; counter++) {
            int cubesOfNumber = counter * counter * counter;
            System.out.println(cubesOfNumber);
        }
    }
}

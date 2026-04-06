import java.util.Random;

public class ColorPicker {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(7) + 1;

        switch(randomNumber) {
            case 1:
                System.out.println("Violet");
                break;
            case 2:
                System.out.println("Indigo");
                break;
            case 3:
                System.out.println("Blue");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Yellow");
                break;
            case 6:
                System.out.println("Orange");
                break;
            case 7:
                System.out.println("Red");
                break;

        }
        
    }
}

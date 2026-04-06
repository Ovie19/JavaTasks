// If width 50 is centered at 0 --> -25 to 25
// If height 150 is centered at 0 --> -75 to 75

import java.util.Random;

public class RandomCoordinate {

    public static void main(String[] args) {

        Random random = new Random();

        int randomWidthPoint = random.nextInt(51) - 25;
        int randomHeightPoint = random.nextInt(76) - 25;

        System.out.printf("Random coordinate is (%d, %d)%n", randomWidthPoint,
            randomHeightPoint);
    }
}


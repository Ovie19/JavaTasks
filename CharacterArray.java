public class CharacterArray {
    public static void main(String[] args) {
        char[][] shars = new char[3][3];

        shars[0][0] = 'X';
        shars[0][1] = 'O';
        shars[0][2] = 'X';

        shars[1][0] = 'O';
        shars[1][1] = 'O';
        shars[1][2] = 'O';

        shars[2][0] = 'X';
        shars[2][1] = 'X';
        shars[2][2] = 'O';

        for(int row = 0; row < shars.length; row++) {
            for (int column = 0; column < shars[0].length; column++) {
                System.out.print(shars[row][column] + " ");
            }

            System.out.println();
        }

        System.out.println();

        for(int row = 0; row < shars.length; row++) {
            for (int column = 0; column < shars[0].length; column++) {
                if (shars[row][column] == 'X')
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }

            System.out.println();
        }
    }
}
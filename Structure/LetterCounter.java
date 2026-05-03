import java.util.Scanner;

public class LetterCounter {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = inputCollector.nextLine();

        int lettersCount = countLetters(word);
        System.out.println("The number of letters in the word is " + lettersCount);
    }

    public static int countLetters(String word) {
        int count = 0;

        for(int index = 0; index < word.length(); index++) {
            int asciiValue = (int) word.charAt(index);

            if(asciiValue >= 65 && asciiValue <= 90 || asciiValue >= 97 && asciiValue <= 122)
                count++;
        }

        return count;
    }
}
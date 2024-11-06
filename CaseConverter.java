/**
 * @Mihir Patel
 * This program takes the word given by the user, and it first applies the titlecase,
 * then turns it into which ever case-type the user suggests.
 */

import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String userWord = console.nextLine();

        System.out.println("Please choose the case you want to convert:");
        System.out.print("1. 'l' or 'L' for lowercase\n2. 'u' or 'U' for uppercase\n3. 't' or 'T' for titlecase\n");
        String caseType = console.nextLine();
        String lowerCaseType = caseType.toLowerCase();
        char chosenCase = lowerCaseType.charAt(0);

        System.out.printf("\n%-37s : %s", "Original word", userWord);
        System.out.printf("\n%-37s : %s", "Calling the first convertCase method", convertCase(userWord));
        System.out.printf("\n%s : %s", "Calling the second convertCase method", convertCase(userWord, chosenCase));
    }
    public static String convertCase(String word) {
        String firstLetter = word.substring(0,1);
        String restOfWord = word.substring(1);
        return firstLetter.toUpperCase() + restOfWord;
    }
    public static String convertCase(String word, char caseType) {
        switch (caseType) {
            case 'l':
                word = word.toLowerCase();
                break;
            case 'u':
                word = word.toUpperCase();
                break;
            case 't':
                word = convertCase(word);
                break;
        }
    return word;
    }
}
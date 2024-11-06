/**
 * @Mihir Patel
 * This program takes the first number and checks if it is divisible by the second
 * number. Then it converts the letter given by the user into a number, and checks
 * if it is divisible by the given number and letter.
 */

import java.util.Scanner;

public class ModuloChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a number and a base, separated by a space: ");
        String numAndBase = console.nextLine();

        String numString1 = numAndBase.substring(0, numAndBase.indexOf(" "));
        String baseString = numAndBase.substring(numAndBase.indexOf(" ") + 1);

        int num = Integer.parseInt(numString1);
        int base1 = Integer.parseInt(baseString);

        if (base1 == 3) {
            if (isDivisible(num)) {
                System.out.println(num + " is divisible by " + 3);
            } else {
                System.out.println(num + " is not divisible by " + 3);
            }
        } else if (isDivisible(num, base1)) {
            System.out.println(num + " is divisible by " + base1);
        } else {
            System.out.println(num + " is not divisible by " + base1);
        }

        System.out.print("\nPlease enter an English letter: ");
        String letter = console.nextLine();
        char chosenLetter = letter.charAt(0);

        System.out.print("Please enter a number base and an English letter base, separated by a space: ");
        String numAndLetter = console.nextLine();
        String numString2 = numAndLetter.substring(0, numAndLetter.indexOf(" "));
        String letterBase = numAndLetter.substring(numAndLetter.indexOf(" ") + 1);

        int base2 = Integer.parseInt(numString2);
        char chosenBase = letterBase.charAt(0);

        if (base2 == 3) {
            if (isDivisible(chosenLetter)) {
                System.out.println("'" + chosenLetter + "'" + " is divisible by " + 3);
            } else {
                System.out.println("'" + chosenLetter + "'" + " is not divisible by " + 3);
            }
        } else if (isDivisible(chosenLetter, base2)) {
            System.out.println("'" + chosenLetter + "'" + " is divisible by " + base2);
        } else {
            System.out.println("'" + chosenLetter + "'" + " is not divisible by " + base2);
        }

        if (isDivisible(chosenLetter, chosenBase)) {
            System.out.println("'" + chosenLetter + "'" + " is divisible by " + "'" + chosenBase + "'");
        } else {
            System.out.println("'" + chosenLetter + "'" + " is not divisible by " + "'" + chosenBase + "'");
        }
    }
    public static int letterToNumber(char c) {
        return Character.toLowerCase(c) - 'a';
    }
    public static boolean isDivisible(int num) {
        return num % 3 == 0;
    }
    public static boolean isDivisible(int num, int base) {
        return num % base == 0;
    }
    public static boolean isDivisible(char letter) {
        return letterToNumber(letter) % 3 == 0;
    }
    public static boolean isDivisible(char letter, int base) {
        return letterToNumber(letter) % base == 0;
    }
    public static boolean isDivisible(char letter, char base) {
        return letterToNumber(letter) % letterToNumber(base) == 0;
    }
}
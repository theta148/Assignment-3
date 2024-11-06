/**
 * @Mihir Patel
 * This program simulates coin tosses while also keeping track of the number of
 * heads and tails.
 */

import java.util.Scanner;
import java.util.Random;

public class CoinToss {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = console.nextInt();
            console.nextLine();

            if (choice == 1) {
                if (flip()) {
                    headsCount++;
                    System.out.print("Heads: " + headsCount + ", Tails: " + tailsCount + "\n");
                } else {
                    tailsCount++;
                    System.out.print("Heads: " + headsCount + ", Tails: " + tailsCount + "\n");
                }
            } else if (choice == 2) {
                break;
            }
        }
    }
    public static boolean flip() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
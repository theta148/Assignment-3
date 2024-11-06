/**
 * @Mihir Patel
 * This program calculates the sum of two chosen numbers, does a chosen operation to the same numbers,
 * and calculates a formular given by the user.
 */

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter two numbers, separated by a space: ");
        String twoNumbers = console.nextLine();

        String str1 = twoNumbers.substring(0, twoNumbers.indexOf(" "));
        String str2 = twoNumbers.substring(twoNumbers.indexOf(" "));

        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);
        double result1 = calcResult(num1, num2);

        System.out.print("Please enter the operator (+, -, *, or /): ");
        String operation = console.nextLine();
        char operator = operation.charAt(0);

        double result2 = calcResult(num1, num2, operator);

        System.out.print("Please enter a formular, e.g.: \"3.14 * 2\": ");
        String formular = console.nextLine();

        double result3 = calcResult(formular);

        System.out.printf("\n%-25s : %.2f + %.2f = %.2f", "Calling the first method", num1, num2, result1);
        System.out.printf("\n%s : %.2f %s %.2f = %.2f", "Calling the second method", num1, operator, num2, result2);
        System.out.printf("\n%-25s : %s = %.2f", "Calling the third method", formular, result3);

    }
    public static double calcResult(double num1, double num2) {
        return num1 + num2;
    }
    public static double calcResult(double num1, double num2, char oper) {
        double result = 0;
        switch (oper) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }
    public static double calcResult(String formula) {
        String str1 = formula.substring(0, formula.indexOf(" "));
        String operation = formula.substring(formula.indexOf(" "), formula.indexOf(" ") + 2);
        String str2 = formula.substring(formula.lastIndexOf(" "));

        double num1 = Double.parseDouble(str1);
        char operator = operation.charAt(1);
        double num2 = Double.parseDouble(str2);

        return calcResult(num1, num2, operator);
    }
}
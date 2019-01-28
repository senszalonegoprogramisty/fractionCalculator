package fractionCalculator;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static String getOperation(Scanner input) {
        System.out.println("Please add a fraction a/b or a");
        //Asks the user to enter in a valid mathematical
        //operation. If the user enters anything except
        // "+", "-", "/", "*", "=", "q", or "Q" it should
        // re-prompt them until there is valid input.
        return "";
    }

    public static boolean validFraction(String input) {
        //returns true if the parameter is in the
        // form "a/b" where a is any int and b is any positive int
        return false;
    }

    public static Fraction getFraction1(Scanner input) {

        //It prompts the user for a String that is a validFraction.
        // If they enter any thing that is not a valid Fraction, it
        // should re-prompt them until it is valid

        return null;
    }
}

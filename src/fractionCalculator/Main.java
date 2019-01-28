package fractionCalculator;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Fraction fraction = new Fraction();
    public static void main(String[] args) {

        System.out.println("This is fraction calculator, you can add, subtract, multiply and divide fractions.\n" +
                "Please enter +, -, *, / or Q to quit");

        String menu = scanner.nextLine();
        boolean flag = true;

        while (flag) {
            switch (menu) {
                case "Q":
                    System.out.println("Quiting program");
                    flag = false;
                    break;
                case "+":
                    addFractions();
                    break;
            }
        }
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

    public static void addFractions() {
        
    }
}

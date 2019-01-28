package fractionCalculator;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static final String OPTIONS = "+-*/=Q";

    public static void main(String[] args) {

        System.out.println("This is fraction calculator, you can add, subtract, multiply and divide fractions.\n");

        boolean flag = true;
        String menu;
        while (flag) {
            menu = getOperation();
            switch (menu) {
                case "Q":
                    System.out.println("Quiting program");
                    flag = false;
                    break;
                case "+":
                    addFractions();
                    break;
                case "-":
                    subtractFractions();
                    break;
                case "*":
                    multiplyFractions();
                    break;
                case "/":
                    divideFractions();
                    break;
                case "=":
                    isFractionEqual();
                    break;
            }
        }
    }

    public static String getOperation() {
        System.out.println("Please enter +, -, *, /, = or Q to quit");
        String menu = scanner.nextLine();
        while (!OPTIONS.contains(menu)) {
            System.out.println("Invalid input. Please enter +, -, *, /, = or Q to quit");
            menu = scanner.nextLine();
        }
        return menu;
    }

    private static Fraction getFraction(Scanner input) {
        String fractionStr = input.next();

        while (!fractionStr.matches("-?\\d+/*(\\+?[1-9]\\d*)*")) {
            System.out.print("Invalid fraction. Please enter (a/b) or (a): ");
            fractionStr = scanner.next();
        }
        if (fractionStr.contains("/")) {
            String[] splitFraction = fractionStr.split("/");
            return new Fraction(Integer.parseInt(splitFraction[0]), Integer.parseInt(splitFraction[1]));
        } else {
            return new Fraction(Integer.parseInt(fractionStr));
        }
    }

    private static void addFractions() {
        System.out.println("Please enter fraction one");
        Fraction fraction1 = getFraction(scanner);
        System.out.println("Please enter fraction two");
        Fraction fraction2 = getFraction(scanner);

        System.out.println(fraction1.toString()+" + "+ fraction2.toString()+" = "+fraction1.add(fraction2));
    }

    private static void subtractFractions() {
        System.out.println("Please enter fraction one");
        Fraction fraction1 = getFraction(scanner);
        System.out.println("Please enter fraction two");
        Fraction fraction2 = getFraction(scanner);

        System.out.println(fraction1.toString()+" - "+ fraction2.toString()+" = "+fraction1.subtract(fraction2));
    }

    private static void multiplyFractions() {
        System.out.println("Please enter fraction one");
        Fraction fraction1 = getFraction(scanner);
        System.out.println("Please enter fraction two");
        Fraction fraction2 = getFraction(scanner);

        System.out.println(fraction1.toString()+" * "+ fraction2.toString()+" = "+fraction1.multiply(fraction2));

    }

    private static void divideFractions() {
        System.out.println("Please enter fraction one");
        Fraction fraction1 = getFraction(scanner);
        System.out.println("Please enter fraction two");
        Fraction fraction2 = getFraction(scanner);

        System.out.println(fraction1.toString()+" / "+ fraction2.toString()+" = "+fraction1.divide(fraction2));
    }

    private static void isFractionEqual() {
        System.out.println("Please enter fraction one");
        Fraction fraction1 = getFraction(scanner);
        System.out.println("Please enter fraction two");
        Fraction fraction2 = getFraction(scanner);

        System.out.println("Are fractions equal? "+fraction1.equals(fraction2));
    }

}

/*
    public static boolean validFraction(String fraction) {

        //returns true if the parameter is in the
        // form "a/b" where a is any int and b is any positive int
        return false;
    }
*/

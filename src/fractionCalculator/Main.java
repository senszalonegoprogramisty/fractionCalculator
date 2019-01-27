package fractionCalculator;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,5);
        Fraction f2 = new Fraction(1,3);
        Fraction f3 = new Fraction(5,10);
        Fraction f4 = new Fraction(1,2);
        Fraction f5 = new Fraction(2,4);

        System.out.println(Fraction.add(f1,f2));
        Fraction sumOff1Andf2 = Fraction.add(f1, new Fraction(2,5));
        System.out.println(sumOff1Andf2);

        System.out.println("--------------");
        System.out.println(f1.add(f2));
        System.out.println("--------------");
        System.out.println(f1.add(new Fraction(3,5)));
        System.out.println("-------Subtract-------");

        System.out.println(f3.subtract(f2));

        System.out.println("-------Multiply-------");
        System.out.println(f4.multiply(f4));

        System.out.println("-------Divide-------");
        System.out.println(f5.divide(f4));

        System.out.println("-------Equals-------");
        System.out.println(f4.equals(f5));

        System.out.println("-------toDouble-------");

        System.out.println(f3.toDouble());
    }
}

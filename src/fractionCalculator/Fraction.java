package fractionCalculator;

import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this(0 , 1);
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0)
            throw new IllegalArgumentException("Denominator cannot be 0");
        if (numerator > 0 && denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        } else if (numerator < 0 && denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
        else
            this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return this.numerator+"/"+this.denominator;
    }

    public Double toDouble() {
        return (double) this.numerator/this.denominator;
    }

    public Fraction add(Fraction fraction) {
        int numeratorSum;
        int denominatorSum;
        if (this.denominator == fraction.getDenominator()) {
            numeratorSum = this.numerator + fraction.getNumerator();
            return new Fraction(numeratorSum, denominator);
        } else if (this.denominator != fraction.getDenominator()) {
            numeratorSum = (fraction.getDenominator()*this.numerator)+(fraction.getNumerator()*this.denominator);
            denominatorSum = this.denominator*fraction.getDenominator();
            return new Fraction(numeratorSum, denominatorSum);
        }
        return null;
    }

    public Fraction subtract(Fraction fraction) {
        int numerator1 = this.numerator;
        int denominator1 = this.denominator;
        int numerator2 = fraction.getNumerator();
        int denominator2 =  fraction.getDenominator();
        int numeratorSum;
        int denominatorSum;

        if (denominator1 == denominator2) {
            numeratorSum = numerator1-numerator2;
            return new Fraction(numeratorSum, denominator1);
        } else {
            denominatorSum = denominator1*denominator2;
            numeratorSum = (denominator2*numerator1)-(numerator2*denominator1);
            return new Fraction(numeratorSum, denominatorSum);
        }
    }

    public Fraction multiply(Fraction fraction) {
        int n1 = this.numerator;
        int d1 = this.denominator;
        int n2 = fraction.getNumerator();
        int d2 = fraction.getDenominator();
        int nSum = n1*n2;
        int dSum = d1*d2;

        return new Fraction(nSum, dSum);
    }

    public Fraction divide(Fraction fraction) {
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        return this.multiply(new Fraction(denominator,numerator));
    }

    public static Fraction add(Fraction fraction1, Fraction fraction2) {
        int n1 = fraction1.getNumerator();
        int d1 = fraction1.getDenominator();
        int n2 = fraction2.getNumerator();
        int d2 = fraction2.getDenominator();
        int dSum;
        int nSum;
        if (d1 == d2) {
            nSum = n1 + n2;
            return new Fraction(nSum, d1);
        } else if (d1 != d2) {
            nSum = (n1*d2)+(n2*d1);
            dSum = d2*d1;
            return new Fraction(nSum, dSum);
        } else
            System.out.println("Error adding fractions");
            return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        double f1 = this.toDouble();
        double f2 = ((Fraction) o).toDouble();
        return f1 == f2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }



    public void GCF() {
        int n = this.numerator; //5
        int d = this.denominator; //10
        int reminder;

        while (n != 0 && d != 0) {
            reminder = n%d;
            n = d;
            d = reminder;
        }
        System.out.println(n);
    }

    public static int GCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return GCD(b, a%b);
    }
}
/*
    GCF greatest common factor

    while a and b are not zero
    find the remainder of a divided by b
    set a to b
    set b to the remainder you found
    return a
     */
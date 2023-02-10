package OOP_2.Task4.models;

import lombok.Getter;
import lombok.Setter;



public class Fraction {
    @Getter
    @Setter
    private int numerator;
    @Getter
    private int denominator;

    public Fraction(int numerator, int denominator) {
        try {
            if (denominator == 0)
                throw new ArithmeticException("The denominator cannot be zero");
            this.numerator = numerator;
            this.denominator = denominator;
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

    }

    //    public Fraction(int numerator, int denominator) throws Exception {
//
//        if (denominator == 0) throw new ArithmeticException("The denominator cannot be zero");
//        this.numerator = numerator;
//        this.denominator = denominator;
//    }
    public void setDenominator(int num) {
        if (num != 0)
            denominator = num;
    }

    public void add(Fraction fraction) {
        if (this.denominator == fraction.denominator) {
            this.numerator += fraction.numerator;
        } else {
            fraction.numerator *= this.denominator;
            this.numerator *= fraction.denominator;
            this.denominator *= fraction.denominator;
            this.numerator += fraction.numerator;
        }
    }

    public void subtract(Fraction fraction) {
        if (this.denominator == fraction.denominator) {
            this.numerator -= fraction.numerator;
        } else {
            fraction.numerator *= this.denominator;
            this.numerator *= fraction.denominator;
            this.denominator *= fraction.denominator;
            this.numerator -= fraction.numerator;
        }
    }

    public void multiply(Fraction fraction) {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
    }

    public void divide(Fraction fraction) {
        this.numerator *= fraction.denominator;
        this.denominator *= fraction.numerator;
    }

    public void Reduce() {
        // Euclidean algorithm
        int n = numerator;
        int d = denominator;
        if (d < n) {
            int number = d;
            d = n;
            n = number;
        }
        int res;
        do {
            res = d % n;
            d = n;
            n = res;
        } while (res != 0);
        this.numerator /= d;
        this.denominator /= d;
    }

    public void Show() {
        System.out.printf("%d / %d",numerator,denominator);
    }
}

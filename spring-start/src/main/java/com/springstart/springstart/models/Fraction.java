package com.springstart.springstart.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class Fraction implements Serializable {
    @Getter
    @Setter
    private int numerator;
    @Getter
    private int denominator;


    public Fraction(int numerator, int denominator) throws Exception {

        if (denominator == 0) throw new ArithmeticException("The denominator cannot be zero");
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void setDenominator(int num) {
        if (num != 0)
            denominator = num;
        else if(numerator==0)
            denominator = num;
    }

    public Fraction add(Fraction fraction) {
        if (this.denominator == fraction.denominator) {
            this.numerator += fraction.numerator;
        } else {
            fraction.numerator *= this.denominator;
            this.numerator *= fraction.denominator;
            this.denominator *= fraction.denominator;
            this.numerator += fraction.numerator;
        }
        return this;
    }

    public Fraction subtract(Fraction fraction) {
        if (this.denominator == fraction.denominator) {
            this.numerator -= fraction.numerator;
        } else {
            fraction.numerator *= this.denominator;
            this.numerator *= fraction.denominator;
            this.denominator *= fraction.denominator;
            this.numerator -= fraction.numerator;
        }

        return  this;
    }

    public Fraction multiply(Fraction fraction) {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
        return  this;
    }

    public Fraction divide(Fraction fraction) {
        this.numerator *= fraction.denominator;
        this.denominator *= fraction.numerator;
        return this;
    }

    public Fraction Reduce() {
        if(this.numerator==0)
            return this;
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
        return this;
    }

    public void Show() {
        System.out.printf("%d / %d",numerator,denominator);
    }
}

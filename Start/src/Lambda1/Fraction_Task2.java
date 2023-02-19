package Lambda1;

import lombok.Getter;
import lombok.Setter;

import java.util.function.Consumer;

public class Fraction_Task2 implements Runnable {
    @Getter
    @Setter
    private int numerator;
    @Getter
    private int denominator;


    public Fraction_Task2(int numerator, int denominator) throws Exception {

        if (denominator == 0) throw new ArithmeticException("The denominator cannot be zero");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public void run() {
        add = (Fraction_Task2 fraction) -> {
            if (this.denominator == fraction.denominator) {
                this.numerator += fraction.numerator;
            } else {
                fraction.numerator *= this.denominator;
                this.numerator *= fraction.denominator;
                this.denominator *= fraction.denominator;
                this.numerator += fraction.numerator;
            }
        };
        subtract = (Fraction_Task2 fraction) -> {
            if (this.denominator == fraction.denominator) {
                this.numerator -= fraction.numerator;
            } else {
                fraction.numerator *= this.denominator;
                this.numerator *= fraction.denominator;
                this.denominator *= fraction.denominator;
                this.numerator -= fraction.numerator;
            }
        };
        multiply = (Fraction_Task2 fraction) -> {
            this.numerator *= fraction.numerator;
            this.denominator *= fraction.denominator;
        };
        divide = (Fraction_Task2 fraction) -> {
            this.numerator *= fraction.denominator;
            this.denominator *= fraction.numerator;
        };
    }

    public void setDenominator(int num) {
        if (num != 0)
            denominator = num;
    }

    public Consumer<Fraction_Task2> add;
    public Consumer<Fraction_Task2> subtract;
    public Consumer<Fraction_Task2> multiply;
    public Consumer<Fraction_Task2> divide;

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
        System.out.printf("%d / %d", numerator, denominator);
    }
}

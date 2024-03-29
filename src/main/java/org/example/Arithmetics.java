package org.example;

public class Arithmetics implements IArithmeticsAdd, IArithmeticsDiff, IArithmeticsDiv, IArithmeticsMult {
    @Override
    public double Addition(double a, double b) {
        return a+b;
    }

    @Override
    public double Difference(double a, double b) {
        return a - b;
    }

    @Override
    public double Division(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }

    @Override
    public double Multiplication(double a, double b) {
        return a * b;
    }
}

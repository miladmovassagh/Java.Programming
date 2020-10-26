package com.usc;

public class CalcPlus implements Calculate {

    public CalcPlus() {

    }

    @Override
    public void calc(double num1, double num2) {
        double plus = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + plus);
    }
}

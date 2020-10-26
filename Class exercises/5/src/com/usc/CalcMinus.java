package com.usc;

public class CalcMinus implements Calculate {

    public CalcMinus() {

    }

    @Override
    public void calc(double num1, double num2) {
        double minus = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + minus);
    }
}

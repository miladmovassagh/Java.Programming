package com.usc;

public class SecondDegreeEquation {
    private double a;
    private double b;
    private double c;

    public SecondDegreeEquation() {
        System.out.println("object is created.");
    }

    public SecondDegreeEquation(double a, double b, double c) {
        setSecondDegreeEquation(a, b, c);
    }

    public void setSecondDegreeEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void deltaCalculation() throws EquationException {
        double delta;
        delta = (b * b) - (4 * a * c);
        if(delta < 0) {
            throw new EquationException("Delta is negative and the equation has no roots.");
        } else if(delta == 0) {
            System.out.println("x = " + (-b / a));
        } else {
            System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        }
    }
}

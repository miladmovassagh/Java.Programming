package com.usc;

public class SimpleCalculator {
    private double number1;
    private double number2;

    public SimpleCalculator() {
        System.out.println("object is created.");
    }
    public SimpleCalculator(double num1, double num2) {
        setSimpleCalculator(num1, num2);
    }
    public void setSimpleCalculator(double num1, double num2) {
        number1 = num1;
        number2 = num2;
    }
    public double sum() {
        return (number1 + number2);
    }
    public double subtraction() {
        return (number1 - number2);
    }
    public double multiplication() {
        return (number1 * number2);
    }
    public double divide() {
        return (number1 / number2);
    }
    public void showOperations() {
        System.out.println(number1 + " + " + number2 + " = " + sum());
        System.out.println(number1 + " - " + number2 + " = " + subtraction());
        System.out.println(number1 + " * " + number2 + " = " + multiplication());
        System.out.println(number1 + " / " + number2 + " = " + divide());
    }
}

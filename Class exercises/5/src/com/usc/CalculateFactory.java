package com.usc;

public class CalculateFactory {

    public static Calculate getCalculate(String c) throws ExceptionManager {
        switch(c) {
            case "+":
                return new CalcPlus();
            case "-":
                return new CalcMinus();
            default:
                throw new ExceptionManager("invalid array!");
        }
    }
}

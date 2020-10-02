package com.usc;

public abstract class Lesson {
    protected int credit;
    protected String preNeed;
    protected String theNeed;

    public void showInformation() {
        System.out.println("number of credit: " + credit);
        System.out.println("preneeds: " + preNeed);
        System.out.println("the needs: " + theNeed);
    }
}

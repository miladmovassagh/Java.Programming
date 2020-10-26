package com.usc;

public class Ferrari extends Car {

    public Ferrari() {

    }

    public Ferrari(String model, String color, int maxSpeed, String engineType, String fuelType, int constructionYear) {
        super(model, color, maxSpeed, engineType, fuelType, constructionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Ferrari turn on");
    }

    @Override
    public void turnOf() {
        System.out.println("Ferrari turn off");
    }

    @Override
    public void doBreak() {
        System.out.println("Ferrari do break");
    }
}

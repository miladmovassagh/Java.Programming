package com.usc;

public class Benz extends Car {

    public Benz() {

    }

    public Benz(String model, String color, int maxSpeed, String engineType, String fuelType, int constructionYear) {
        super(model, color, maxSpeed, engineType, fuelType, constructionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Benz turn on");
    }

    @Override
    public void turnOf() {
        System.out.println("Benz turn off");
    }

    @Override
    public void doBreak() {
        System.out.println("Benz do break");
    }
}

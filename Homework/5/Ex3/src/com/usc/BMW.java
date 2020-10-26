package com.usc;

public class BMW extends Car {

    public BMW() {

    }

    public BMW(String model, String color, int maxSpeed, String engineType, String fuelType, int constructionYear) {
        super(model, color, maxSpeed, engineType, fuelType, constructionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("BMW turn on");
    }

    @Override
    public void turnOf() {
        System.out.println("BMW turn off");
    }

    @Override
    public void doBreak() {
        System.out.println("BMW do break");
    }
}

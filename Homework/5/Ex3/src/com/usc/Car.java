package com.usc;

public abstract class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private String engineType;
    private String fuelType;
    private int constructionYear;

    public Car() {

    }

    public Car(String model, String color, int maxSpeed, String engineType, String fuelType, int constructionYear) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.constructionYear = constructionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public abstract void turnOn();

    public abstract void turnOf();

    public abstract void doBreak();

    public void showTechnicalSpecificationsOfCar() {
        System.out.println("technical specification of car:");
        System.out.println("model is: " + model);
        System.out.println("color is: " + color);
        System.out.println("maximum of speed is: " + maxSpeed);
        System.out.println("type of engine is: " + engineType);
        System.out.println("type of fuel is: " + fuelType);
        System.out.println("year of construction is: " + constructionYear);
    }
}

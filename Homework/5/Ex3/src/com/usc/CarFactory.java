package com.usc;

public class CarFactory {

    public static Car getCar(String str, String model, String color, int maxSpeed, String engineType, String fuelType, int constructionYear) throws ExceptionManager {
        switch(str) {
            case "BENZ":
                return new Benz(model, color, maxSpeed, engineType, fuelType, constructionYear);
            case "BMW":
                return new BMW(model, color, maxSpeed, engineType, fuelType, constructionYear);
            case "FERRARI":
                return new Ferrari(model, color, maxSpeed, engineType, fuelType, constructionYear);
            default:
                throw new ExceptionManager("car model exception!!");
        }
    }
}

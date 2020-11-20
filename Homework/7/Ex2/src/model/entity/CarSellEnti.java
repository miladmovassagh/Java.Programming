package model.entity;

public class CarSellEnti {
    private int carId;
    private String username;

    public CarSellEnti() {

    }

    public CarSellEnti(int carId, String username) {
        this.carId = carId;
        this.username = username;
    }

    public int getCarId() {
        return carId;
    }

    public CarSellEnti setCarId(int carId) {
        this.carId = carId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public CarSellEnti setUsername(String username) {
        this.username = username;
        return this;
    }
}

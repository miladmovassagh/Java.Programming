package model.entity;

public class SaipaEnti {
    private int carId;
    private String model;
    private String color;
    private int maxSpeed;
    private int constructionYear;
    private String price;

    public SaipaEnti() {

    }

    public SaipaEnti(int carId, String model, String color, int maxSpeed, int constructionYear, String  price) {
        this.carId = carId;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.constructionYear = constructionYear;
        this.price = price;
    }

    public int getCarId() {
        return carId;
    }

    public SaipaEnti setCarId(int carId) {
        this.carId = carId;
        return this;
    }

    public String getModel() {
        return model;
    }

    public SaipaEnti setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return color;
    }

    public SaipaEnti setColor(String color) {
        this.color = color;
        return this;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public SaipaEnti setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public SaipaEnti setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public SaipaEnti setPrice(String price) {
        this.price = price;
        return this;
    }
}

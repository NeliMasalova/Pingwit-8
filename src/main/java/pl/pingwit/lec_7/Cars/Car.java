package pl.pingwit.lec_7.Cars;

public class Car {
    private String brand;
    private String model;
    private int doors;

    public Car(String brand, String model, int doors) {
        this.brand = brand;
        this.model = model;
        this.doors = doors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}

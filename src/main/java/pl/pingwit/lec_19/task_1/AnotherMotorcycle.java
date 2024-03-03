package pl.pingwit.lec_19.task_1;

public class AnotherMotorcycle {
    private String brand;
    private String model;
    private int engineVolume;
    private String condition;

    public AnotherMotorcycle() {
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public AnotherMotorcycle(String brand, String model, int engineVolume, String condition) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.condition = condition;
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

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "AnotherMotorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", condition='" + condition + '\'' +
                '}';
    }
}

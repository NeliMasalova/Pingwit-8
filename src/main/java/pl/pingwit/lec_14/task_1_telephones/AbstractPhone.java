package pl.pingwit.lec_14.task_1_telephones;

abstract class AbstractPhone implements Phone {
    protected String brand;
    protected String model;

    public AbstractPhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
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

    @Override
    public void makeCall() {
    }

    @Override
    public void receiveCall() {
    }

    @Override
    public String toString() {
        return "AbstractPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
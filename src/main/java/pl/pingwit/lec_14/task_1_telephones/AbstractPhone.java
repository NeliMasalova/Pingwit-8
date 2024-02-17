package pl.pingwit.lec_14.task_1_telephones;

abstract class AbstractPhone implements Phone {
    protected String brand;
    protected String model;

    public AbstractPhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "AbstractPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
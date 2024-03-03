package pl.pingwit.lec_19.task_1;

import java.io.Serializable;
import java.util.Objects;


//Создайте класс Motorcycle, в котором должны быть поля brand, model, engineVolume (объем двигателя в см3),
//        String condition.
//        В классе application создайте объект типа Motocycle и сериализуйте его с помощью java-сериализации. Поле
//        condition сериализоваться не должно!
//        Далее в этом же классе десериализуйте Motocycle из файла и выведите его в консоль
public class Motorcycle implements Serializable {
    private String brand;
    private String model;
    private int engineVolume;
    private transient String condition;
    public Motorcycle() {
    }
    public Motorcycle(String brand, String model, int engineVolume, String condition) {
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

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", condition='" + condition + '\'' +
                '}';
    }
}
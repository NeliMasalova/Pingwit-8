package pl.pingwit.part_25.task_5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("Audi", "R34", "gas"),
                new Car("Toyota", "Prius", "gas"),
                new Car("Audi", "A6", "electric vehicle"),
                new Car("Volvo", "XC50", "diesel"),
                new Car("Opel", "Corsa", "gas"),
                new Car("Volvo", "V40", "electric vehicle"),
                new Car("Opel", "Zafira", "gas"),
                new Car("Volvo", "XC60", "electric vehicle"),
                new Car("Opel", "Astra", "electric vehicle"));


        Map<Boolean, List<Car>> electricVehicle = cars.stream()
                .collect(Collectors.partitioningBy(car -> car.type().equals("electric vehicle")));
        System.out.println(electricVehicle);
    }
}
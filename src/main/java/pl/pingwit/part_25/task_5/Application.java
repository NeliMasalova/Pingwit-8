package pl.pingwit.part_25.task_5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Cars> cars = List.of(new Cars("Audi", "R34", "gas"),
                new Cars("Toyota", "Prius", "gas"),
                new Cars("Audi", "A6", "electric vehicle"),
                new Cars("Volvo", "XC50", "diesel"),
                new Cars("Opel", "Corsa", "gas"),
                new Cars("Volvo", "V40", "electric vehicle"),
                new Cars("Opel", "Zafira", "gas"),
                new Cars("Volvo", "XC60", "electric vehicle"),
                new Cars("Opel", "Astra", "electric vehicle"));


        Map<Boolean, List<Cars>> electricVehicle = cars.stream()
                .collect(Collectors.partitioningBy(car -> car.type().equals("electric vehicle")));
        System.out.println(electricVehicle);
    }
}
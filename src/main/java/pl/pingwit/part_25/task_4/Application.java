package pl.pingwit.part_25.task_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("Toyota", "Tundra"),
                new Car("Audi", "R34"),
                new Car("Toyota", "Prius"),
                new Car("Audi", "A6"),
                new Car("Volvo", "XC50"),
                new Car("Opel", "Corsa"),
                new Car("Volvo", "V40"),
                new Car("Opel", "Zafira"),
                new Car("Volvo", "XC60"),
                new Car("Opel", "Astra"));


        /*TreeMap<String, Set<Car>> collect = cars.stream()
                .collect(Collectors.groupingBy(Car::producer, () -> new TreeMap<>(), Collectors.toSet()));*/

        Map<String, List<Car>> carsByProducers = cars.stream()
                .collect(Collectors.groupingBy(car -> car.producer()));
        System.out.println(carsByProducers);
    }
}
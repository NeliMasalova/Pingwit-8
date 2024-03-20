package pl.pingwit.part_25.task_4;

import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Cars> cars = List.of(new Cars("Toyota", "Tundra"),
                new Cars("Audi", "R34"),
                new Cars("Toyota", "Prius"),
                new Cars("Audi", "A6"),
                new Cars("Volvo", "XC50"),
                new Cars("Opel", "Corsa"),
                new Cars("Volvo", "V40"),
                new Cars("Opel", "Zafira"),
                new Cars("Volvo", "XC60"),
                new Cars("Opel", "Astra"));


        TreeMap<String, Set<Cars>> collect = cars.stream()
                .collect(Collectors.groupingBy(Cars::producer, () -> new TreeMap<>(), Collectors.toSet()));

        System.out.println(collect);
    }
}

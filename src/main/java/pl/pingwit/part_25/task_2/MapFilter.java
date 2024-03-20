package pl.pingwit.part_25.task_2;

import java.util.List;

public class MapFilter {
    public static void main(String[] args) {
        List<Phones> phones = List.of(new Phones("Galaxy S10", "Samsung"),
                new Phones("GalaxyS20", "Samsung"),
                new Phones("Redmi Note 13 Pro", "Xiaomi"),
                new Phones("iPhone 13", "Apple"),
                new Phones("iPhone", "Apple"),
                new Phones("3310", "Nokia"),
                new Phones("W710i", "Sony Ericsson"));

        List<String> producers = phones.stream()
                .map(phone -> phone.producer())
                .filter(producer -> List.of("Apple", "Samsung", "Xiaomi").contains(producer))
                .toList();
        producers.forEach(System.out::println);
    }
}
package pl.pingwit.part_25.task_2;

import java.util.List;

public class MapFilter {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Galaxy S10", "Samsung"),
                new Phone("GalaxyS20", "Samsung"),
                new Phone("Redmi Note 13 Pro", "Xiaomi"),
                new Phone("iPhone 13", "Apple"),
                new Phone("iPhone", "Apple"),
                new Phone("3310", "Nokia"),
                new Phone("W710i", "Sony Ericsson"));

        List<String> acceptedProducers = List.of("Apple", "Samsung", "Xiaomi");

        List<String> producers = phones.stream()
                .map(phone -> phone.producer())
                .filter(producer -> acceptedProducers.contains(producer))
                .toList();
        producers.forEach(System.out::println);
    }
}
package pl.pingwit.part_26.task_1;

import java.util.List;

//easy :)
public class Distinct {
    public static void main(String[] args) {
        List<Phone> phones = List.of(new Phone("Nokia", "3310"), //new phone лучше с новой строки
                new Phone("Samsung", "Galaxy S10i"),
                new Phone("Sony Ericsson", "W710i"),
                new Phone("Siemens", "A52"),
                new Phone("Siemens", "A52"),
                new Phone("Iphone", "13ProMax"),
                new Phone("Samsung", "Galaxy S20"),
                new Phone("Samsung", "Galaxy S20"));

        phones.stream()
                .distinct()
                .forEach(System.out::println);
    }
}

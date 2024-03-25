package pl.pingwit.lec_24.task_2;

import java.util.ArrayList;
import java.util.List;

public class CityFilterList {
    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("Минск", "Проспект Независимости", 10, 10));
        addresses.add(new Address("Минск", "Проспект Независимости", 100, 44));
        addresses.add(new Address("Минск", "Октябрьская", 16, 1));
        addresses.add(new Address("Минск", "Октябрьская", 16, 1));
        addresses.add(new Address("Warsaw", "Wilcza", 52, 23));
        addresses.add(new Address("Warsaw", "Hoża", 13, 13));
        addresses.add(new Address("Киев", "Крещатик", 13, 13));
        addresses.add(new Address("Киев", "Октябрьская", 1, 10));

        List<Address> resultFilterCity = addresses.stream()
                .filter(city -> city.getCity().equals(("Киев")))
                .toList();

        resultFilterCity.forEach(System.out::println);
    }
}

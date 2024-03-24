package pl.pingwit.lec_24.task_3;

import pl.pingwit.lec_24.task_2.Address;

import java.util.ArrayList;
import java.util.List;

public class StreetList {
    public static void main(String[] args) {
        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(new Address("Минск", "Проспект Независимости", 10, 10));
        addresses.add(new Address("Минск", "Проспект Независимости", 100, 44));
        addresses.add(new Address("Минск", "Октябрьская", 16, 1));
        addresses.add(new Address("Минск", "Октябрьская", 16, 1));
        addresses.add(new Address("Warsaw", "Wilcza", 52, 23));
        addresses.add(new Address("Warsaw", "Hoża", 13, 13));
        addresses.add(new Address("Киев", "Крещатик", 13, 13));
        addresses.add(new Address("Киев", "Октябрьская", 1, 10));

        List<String> resultStreets = addresses.stream()
                .map(Address::getStreet)
                .toList();

        resultStreets.forEach(System.out::println);
    }
}

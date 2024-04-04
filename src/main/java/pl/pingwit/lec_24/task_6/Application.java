package pl.pingwit.lec_24.task_6;

import pl.pingwit.lec_24.task_2.Address;
import pl.pingwit.lec_24.task_5.CityStreet;

import java.util.ArrayList;
import java.util.List;

public class Application {
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

        addresses.stream()
                .filter(address -> address.getCity().equals("Киев"))
                .map(address -> new CityStreet(address.getCity(), address.getStreet()))
                .forEach(cityStreet -> System.out.println("Улица: " + cityStreet));
    }
}
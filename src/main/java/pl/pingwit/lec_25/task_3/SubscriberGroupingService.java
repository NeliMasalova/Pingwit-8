package pl.pingwit.lec_25.task_3;

import pl.pingwit.lec_25.Subscriber;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubscriberGroupingService {
    public Map<String, List<Subscriber>> groupingByCity(List<Subscriber> subscribers) {
        Map<String, List<Subscriber>> resultByCity = subscribers.stream()
                .collect(Collectors.groupingBy(subscriber -> subscriber.getCity()));

        resultByCity.forEach((city, subscriber) -> {
            System.out.println(city);
            subscriber.forEach(System.out::println);
        });
        return resultByCity;
    }

    public Map<String, Subscriber> searchNoVip(List<Subscriber> subscribers) {
        Map<String, Subscriber> resultNoVip = subscribers.stream()
                .filter(subscriber -> !subscriber.getVip())
                .collect(Collectors.toMap(subscriber -> subscriber.getContractId(), subscriber -> subscriber));
        System.out.println(resultNoVip);
        return resultNoVip;
    }
}
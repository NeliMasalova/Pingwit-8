package pl.pingwit.lec_25.task_3;

import pl.pingwit.lec_25.Subscriber;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubscriberGroupingService {
    public Map<String, List<Subscriber>> groupingByCity(List<Subscriber> subscribers) {
        return subscribers.stream()
                .collect(Collectors.groupingBy(Subscriber::getCity));
    }

    public Map<String, Subscriber> searchNoVip(List<Subscriber> subscribers) {
        return subscribers.stream()
                .filter(subscriber -> !subscriber.getVip())
                .collect(Collectors.toMap(Subscriber::getContractId, subscriber -> subscriber));
    }
}
package pl.pingwit.lec_25.task_1;

import pl.pingwit.lec_25.Subscriber;

import java.time.LocalDate;
import java.util.List;

public class SubscriberFindService {
    public boolean allSubscribersConnectionBeforeDate(List<Subscriber> subscribers, LocalDate connectionDate) {
        return subscribers.stream()
                .allMatch(subscriber -> subscriber.getContractDate().isBefore(connectionDate));
    }

    public Subscriber findAnySubscriber(List<Subscriber> subscribers, String city) {
        return subscribers.stream()
                .filter(subscriber -> subscriber.getCity().equals(city))
                .findAny()
                .orElseThrow(() -> new RuntimeException("Subscribers don't found"));
    }

    public boolean vipSearch(List<Subscriber> subscribers, String city) {
        return subscribers.stream()
                .anyMatch(subscriber -> subscriber.getCity().equals(city) && subscriber.getVip());
    }
}
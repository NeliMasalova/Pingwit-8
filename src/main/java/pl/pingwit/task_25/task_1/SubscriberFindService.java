package pl.pingwit.task_25.task_1;

import pl.pingwit.task_25.Subscriber;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class SubscriberFindService {
    public boolean allSubscribersConnectionBeforeDate(List<Subscriber> subscribers, LocalDate connectionDate) {
        boolean result = subscribers.stream()
                .allMatch(subscriber -> subscriber.getContractDate().isBefore(connectionDate));
        System.out.println(result);
        return result;
    }

    public Optional<Subscriber> findAnySubscriber(List<Subscriber> subscribers, String city) {
        Optional<Subscriber> resultFindAny = subscribers.stream()
                .filter(subscriber -> subscriber.getCity().equals(city))
                .findAny();
        Subscriber subscriber = resultFindAny.orElseThrow(() -> new RuntimeException("Subscribers don't found"));
        System.out.println(subscriber);
        return resultFindAny;
    }

    public boolean vipSearch(List<Subscriber> subscribers, String city) {
        boolean resultVipSearch = subscribers.stream()
                .anyMatch(subscriber -> subscriber.getCity().equals(city) && subscriber.getVip());
        System.out.println(resultVipSearch);
        return resultVipSearch;
    }
}
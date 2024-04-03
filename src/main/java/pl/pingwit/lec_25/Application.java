package pl.pingwit.lec_25;

import pl.pingwit.lec_25.task_1.SubscriberFindService;
import pl.pingwit.lec_25.task_3.SubscriberGroupingService;
import java.util.List;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        List<Subscriber> subscribers = List.of(
                new Subscriber("Piter", "Parker", "101", LocalDate.of(1993, 12, 7), LocalDate.of(2024, 3, 7), true, "Warsaw"),
                new Subscriber("Alexander", "Fisher", "102", LocalDate.of(1983, 8, 12), LocalDate.of(2020, 11, 17), true, "New-York"),
                new Subscriber("Olivia", "Adams", "103", LocalDate.of(1984, 8, 11), LocalDate.of(2023, 3, 27), false, "Warsaw"),
                new Subscriber("Robert", "Lewandowski", "104", LocalDate.of(1975, 10, 15), LocalDate.of(2008, 11, 7), false, "Gdansk"),
                new Subscriber("Teresa", "May", "105", LocalDate.of(2001, 1, 1), LocalDate.of(2022, 6, 7), true, "Berlin"));

        SubscriberFindService subscriberFindService = new SubscriberFindService();
        subscriberFindService.findAnySubscriber(subscribers, "Warsaw");
        subscriberFindService.allSubscribersConnectionBeforeDate(subscribers, LocalDate.now());
        subscriberFindService.vipSearch(subscribers, "Warsaw");

        System.out.println("=========task_3.1============");
        SubscriberGroupingService subscriberGroupingService = new SubscriberGroupingService();
        subscriberGroupingService.groupingByCity(subscribers);

        System.out.println("======task_3.2=========");
        subscriberGroupingService.searchNoVip(subscribers);

    }
}
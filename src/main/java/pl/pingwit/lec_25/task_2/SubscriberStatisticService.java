package pl.pingwit.lec_25.task_2;

import pl.pingwit.lec_25.Subscriber;

import java.time.LocalDate;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SubscriberStatisticService {
    public IntSummaryStatistics subscriberStatisticByAge(List<Subscriber> subscribers) {
        IntSummaryStatistics statisticByAge = subscribers.stream()
                .map(subscriber -> subscriber.getDateOfBirth())
                .collect(Collectors.summarizingInt(date -> LocalDate.now().getYear() - date.getYear()));
        System.out.println(statisticByAge);
        return statisticByAge;
    }

    public IntSummaryStatistics subscriberStatisticByContractDay(List<Subscriber> subscribers) {
        IntSummaryStatistics statisticsByContractDay = subscribers.stream()
                .map(subscriber -> subscriber.getContractDate())
                .collect(Collectors.summarizingInt(date -> LocalDate.now().getYear() - date.getYear()));
        System.out.println(statisticsByContractDay);
        return statisticsByContractDay;
    }
}
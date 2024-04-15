package pl.pingwit.lec_25.task_2;

import pl.pingwit.lec_25.Subscriber;

import java.time.LocalDate;
import java.time.Period;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SubscriberStatisticService {
    public String subscriberStatisticByAge(List<Subscriber> subscribers) {
        IntSummaryStatistics statisticByAge = subscribers.stream()
                .map(Subscriber::getDateOfBirth)
                .map(date -> Period.between(date, LocalDate.now()))
                .map(Period::getYears)
                .collect(Collectors.summarizingInt(Integer::intValue));//абзац
        return String.format("Количество абонентов - %d. Самый юный - %d лет, самый возрастной - %d лет, средний возраст - %f лет.",
                statisticByAge.getCount(), statisticByAge.getMin(), statisticByAge.getMax(), statisticByAge.getAverage());
    }

    public String subscriberStatisticByContractDay(List<Subscriber> subscribers) {
        IntSummaryStatistics statisticsByContractDay = subscribers.stream()// еще нужен фильтр на проверку VIP
                .map(Subscriber::getContractDate)
                .map(date -> Period.between(date, LocalDate.now()))
                .map(Period::getYears)
                .collect(Collectors.summarizingInt(Integer::intValue));//абзац
        return String.format("Количество абонентов - %d. Самый долгий контракт - %d. Средний срок контракта - %f лет.",
                statisticsByContractDay.getCount(), statisticsByContractDay.getMax(), statisticsByContractDay.getAverage());
    }
}
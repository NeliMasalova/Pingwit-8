package pl.pingwit.lec_24.task_9;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        List<UserInfo> userInfos = List.of(
                new UserInfo("Sasha", "Petrov", "1234567", "sp@gmail.com", LocalDate.of(1990, 12, 12)),
                new UserInfo("Pavel", "Ivanov", "987654", "pi@gmail.com", LocalDate.of(1990, 12, 12)),
                new UserInfo("Anna", "Sidorova", "332211", "as@gmail.com", LocalDate.of(2005, 12, 12)),
                new UserInfo("Lena", "Ivanova", "76555", "li@gmail.com", LocalDate.of(1998, 12, 12)),
                new UserInfo("Sasha", "Sergeeev", "98876666", "ss@gmail.com", LocalDate.of(2005, 12, 12)));

        Predicate<UserInfo> startsWithPredicate = userInfo -> !userInfo.name().startsWith("S")
                && !userInfo.name().startsWith("P")
                && !userInfo.name().startsWith("A");

        List<UserInfo> infosResult = userInfos.stream()
                .filter(startsWithPredicate)
                .toList();

        infosResult.forEach(System.out::println);
    }
}
package pl.pingwit.lec_24.task_9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        List<UserInfo> userInfos = getUserInfos();

//        Predicate<UserInfo> excludeNamesStartsWith = userInfo -> userInfo.name().startsWith("S")
//                || userInfo.name().startsWith("P")
//                || userInfo.name().startsWith("A");
//        excludeNamesStartsWith.negate();

        Predicate<UserInfo> excludeNamesStartsWith =Predicate.not(userInfo -> userInfo.name().startsWith("S")
                || userInfo.name().startsWith("P")
                || userInfo.name().startsWith("A"));
        userInfos.removeIf(excludeNamesStartsWith);
        System.out.println(userInfos);
    }

    private static List<UserInfo> getUserInfos() {
        List<UserInfo> userInfos = new ArrayList<>();

        UserInfo userSasha = new UserInfo("Sasha", "Petrov", "1234567", "sp@gmail.com", LocalDate.of(1990, 12, 12));
        UserInfo userPavel = new UserInfo("Pavel", "Ivanov", "987654", "pi@gmail.com", LocalDate.of(1990, 12, 12));
        UserInfo userAnna = new UserInfo("Anna", "Sidorova", "332211", "as@gmail.com", LocalDate.of(2005, 12, 12));
        UserInfo userLena = new UserInfo("Lena", "Ivanova", "76555", "li@gmail.com", LocalDate.of(1998, 12, 12));
        UserInfo userSashaS = new UserInfo("Sasha", "Sergeeev", "98876666", "ss@gmail.com", LocalDate.of(2005, 12, 12));

        userInfos.add(userAnna);
        userInfos.add(userLena);
        userInfos.add(userPavel);
        userInfos.add(userSashaS);
        userInfos.add(userSasha);
        return userInfos;
    }
}
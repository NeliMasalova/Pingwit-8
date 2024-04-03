package pl.pingwit.lec_22.task_1;

import pl.pingwit.lec_21.task_2.VisitingOnlineResources;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<VisitingOnlineResources> visits = getVisitingOnlineResources();

        /*Map<String, Integer> stringIntegerMap = countUser(visits);
        System.out.println(stringIntegerMap);*/

        Map<String, Long> resultByVisitingSite = visits.stream()
                .collect(Collectors.groupingBy(visitingOnlineResources -> visitingOnlineResources.userName(),
                        Collectors.counting()));
        System.out.println(resultByVisitingSite);
    }

    private static List<VisitingOnlineResources> getVisitingOnlineResources() {
        List<VisitingOnlineResources> visits = new ArrayList<>();
        visits.add(new VisitingOnlineResources("Alex", "aliaksandr-famin-s-school.teachable.com"));
        visits.add(new VisitingOnlineResources("Alex", "javarush.com"));
        visits.add(new VisitingOnlineResources("Piter", "l.wikipedia.org"));
        visits.add(new VisitingOnlineResources("Piter", "l.wikipedia.org"));
        visits.add(new VisitingOnlineResources("Ben", "gismeteo.pl"));
        visits.add(new VisitingOnlineResources("Ben", "gismeteo.pl"));
        visits.add(new VisitingOnlineResources("Ben", "github.com"));
        return visits;
    }

    private static Map<String, Integer> countUser(List<VisitingOnlineResources> visits) {
        Map<String, Integer> visitsCount = new TreeMap<>();
        for (VisitingOnlineResources visit : visits) { 
            String userName = visit.userName();
            if (visitsCount.containsKey(userName)) {
                Integer count = visitsCount.get(userName);
                visitsCount.put(userName, count + 1);
            } else {
                visitsCount.put(userName, 1);
            }
        }
        return visitsCount;
    }
}
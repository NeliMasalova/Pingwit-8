package pl.pingwit.lec_21.task_2;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        ArrayList<VisitingOnlineResources> visits = new ArrayList<>();
        visits.add(new VisitingOnlineResources("Alex", "aliaksandr-famin-s-school.teachable.com"));
        visits.add(new VisitingOnlineResources("Alex", "javarush.com"));
        visits.add(new VisitingOnlineResources("Piter", "l.wikipedia.org"));
        visits.add(new VisitingOnlineResources("Piter", "l.wikipedia.org"));
        visits.add(new VisitingOnlineResources("Ben", "gismeteo.pl"));
        visits.add(new VisitingOnlineResources("Ben", "gismeteo.pl"));
        visits.add(new VisitingOnlineResources("Ben", "github.com"));

        Set<String> uniqueUserName = getUniqueUserName(visits);
        System.out.println("Unique usernames: " + uniqueUserName);

        Set<String> uniqueSiteName = getUniqueSiteName(visits);
        System.out.println("Unique websites: " + uniqueSiteName);

        Map<String, Integer> visitSiteCount = getVisitSiteCount(visits);
        System.out.println(visitSiteCount);
    }

    private static Set<String> getUniqueUserName(ArrayList<VisitingOnlineResources> visits) {
        Set<String> userNames = new TreeSet<>();
        for (VisitingOnlineResources visit : visits) {
            userNames.add(visit.userName());
        }
        return userNames;
    }

    private static Set<String> getUniqueSiteName(ArrayList<VisitingOnlineResources> visits) {
        Set<String> siteNames = new TreeSet<>();
        for (VisitingOnlineResources visit : visits) {
            siteNames.add(visit.siteName());
        }
        return siteNames;
    }

    private static Map<String, Integer> getVisitSiteCount(ArrayList<VisitingOnlineResources> visits) {
        Map<String, Integer> visitCounts = new TreeMap<>();
        for (VisitingOnlineResources visit : visits) {
            String siteName = visit.siteName();
            if (visitCounts.containsKey(siteName)) {
                Integer counts = visitCounts.get(siteName);
                visitCounts.put(siteName, counts + 1);
            } else {
                visitCounts.put(siteName, 1);
            }
        }
        return visitCounts;
    }
}
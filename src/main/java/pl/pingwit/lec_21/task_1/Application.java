package pl.pingwit.lec_21.task_1;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        ArrayList<FootballTeam> clubs = new ArrayList<>();
        clubs.add(new FootballTeam("Germany", "Munich", "Bayern Munich"));
        clubs.add(new FootballTeam("England", "London", "Chelsea"));
        clubs.add(new FootballTeam("Spain", "Madrid", "Real Madrid"));
        clubs.add(new FootballTeam("Germany", "Schalke", "Schalke 04"));

        Set<String> uniqueCountries = getClubCountry(clubs);
        System.out.println(uniqueCountries);
    }

    private static Set<String> getClubCountry(ArrayList<FootballTeam> clubs) {
        Set<String> countries = new HashSet<>();
        for (FootballTeam club : clubs) {
            countries.add(club.getCountry());
        }
        return countries;
    }
}
package pl.pingwit.part_25.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        VisitedCountry usa = new VisitedCountry("USA", List.of("Washington", "Las-Vegas", "Portland"));
        VisitedCountry spain = new VisitedCountry("Spain", List.of("Madrid", "Barcelona"));
        VisitedCountry germany = new VisitedCountry("Germany", List.of("Berlin", "Frankfurt"));
        VisitedCountry france = new VisitedCountry("France", List.of("Paris", "Lyon", "Nice"));
        VisitedCountry poland = new VisitedCountry("Poland", List.of("Warsaw", "Gdansk", "Bialystok"));
        VisitedCountry belarus = new VisitedCountry("Belarus", List.of("Minsk", "Polotsk", "Grodno"));
        VisitedCountry usa1 = new VisitedCountry("USA", List.of("Atlanta", "Washington", "Las-Vegas"));
        VisitedCountry france1 = new VisitedCountry("France", List.of("Paris", "Nice", "Strasbourg"));

        List<VisitedCountry> countriesPiter = List.of(usa, spain, france);
        List<VisitedCountry> countriesAdam = List.of(germany, poland, belarus);
        List<VisitedCountry> countriesPaula = List.of(usa1, france1);

        Traveler piterParker = new Traveler("Piter Parker", countriesPiter);
        Traveler adamFisher = new Traveler("Adam Fisher", countriesAdam);
        Traveler paulaBright = new Traveler("Paula Bright", countriesPaula);

        List<Traveler> travelers = new ArrayList<>();
        travelers.add(adamFisher);
        travelers.add(piterParker);
        travelers.add(paulaBright);

        String uniqueCities = travelers.stream()
                .map(traveler -> traveler.getVisitedCountries())
                .flatMap(visitedCountries -> visitedCountries.stream())
                .map(visitedCountry -> visitedCountry.getCities())
                .flatMap(cities -> cities.stream())
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println(uniqueCities);
    }
}
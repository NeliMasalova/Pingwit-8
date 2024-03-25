package pl.pingwit.part_25.task_6;

import java.util.List;
import java.util.Objects;

public class Traveler {
    private String name;
    private List<VisitedCountry> visitedCountries;

    public Traveler(String name, List<VisitedCountry> visitedCountries) {
        this.name = name;
        this.visitedCountries = visitedCountries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<VisitedCountry> getVisitedCountries() {
        return visitedCountries;
    }

    public void setVisitedCountries(List<VisitedCountry> visitedCountries) {
        this.visitedCountries = visitedCountries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Traveler traveler = (Traveler) o;
        return Objects.equals(name, traveler.name) && Objects.equals(visitedCountries, traveler.visitedCountries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, visitedCountries);
    }

    @Override
    public String toString() {
        return "Traveler{" +
                "name='" + name + '\'' +
                ", visitedCountries=" + visitedCountries +
                '}';
    }
}
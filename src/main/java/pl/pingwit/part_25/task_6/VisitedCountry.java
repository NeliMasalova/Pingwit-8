package pl.pingwit.part_25.task_6;

import java.util.List;
import java.util.Objects;

public class VisitedCountry {
    private String country;
    private List<String> cities;

    public VisitedCountry(String country, List<String> cities) {
        this.country = country;
        this.cities = cities;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisitedCountry that = (VisitedCountry) o;
        return Objects.equals(country, that.country) && Objects.equals(cities, that.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, cities);
    }

    @Override
    public String toString() {
        return "VisitedCountries{" +
                "countryName='" + country + '\'' +
                ", cities=" + cities +
                '}';
    }
}

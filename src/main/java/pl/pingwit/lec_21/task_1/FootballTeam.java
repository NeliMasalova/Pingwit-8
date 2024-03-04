package pl.pingwit.lec_21.task_1;

import java.util.Objects;

public class FootballTeam {
    private String country;
    private String city;
    private String club;

    public FootballTeam(String country, String city, String club) {
        this.country = country;
        this.city = city;
        this.club = club;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballTeam that = (FootballTeam) o;
        return Objects.equals(country, that.country) && Objects.equals(city, that.city) && Objects.equals(club, that.club);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, club);
    }

    @Override
    public String toString() {
        return "FootballTeams{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", club='" + club + '\'' +
                '}';
    }
}
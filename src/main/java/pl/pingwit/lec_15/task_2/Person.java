package pl.pingwit.lec_15.task_2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private DayOfWeek favouriteDay;

    public Person(String name, String surname, LocalDate birthDate, DayOfWeek favouriteDay) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.favouriteDay = favouriteDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public DayOfWeek getFavouriteDay() {
        return favouriteDay;
    }

    public void setFavouriteDay(DayOfWeek favouriteDay) {
        this.favouriteDay = favouriteDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", favouriteDay=" + favouriteDay +
                '}';
    }
}
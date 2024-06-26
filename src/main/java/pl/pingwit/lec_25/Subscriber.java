package pl.pingwit.lec_25;

import java.time.LocalDate;
import java.util.Objects;

public class Subscriber {
    private final String name;
    private final String surname;
    private final String contractId;
    private final LocalDate dateOfBirth;
    private final LocalDate contractDate;
    private final Boolean isVip;
    private final String city;

    public Subscriber(String name, String surname, String contractId, LocalDate dateOfBirth, LocalDate contractDate, Boolean isVip, String city) {
        this.name = name;
        this.surname = surname;
        this.contractId = contractId;
        this.dateOfBirth = dateOfBirth;
        this.contractDate = contractDate;
        this.isVip = isVip;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getContractId() {
        return contractId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public Boolean getVip() {
        return isVip;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(contractId, that.contractId) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(contractDate, that.contractDate) && Objects.equals(isVip, that.isVip) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, contractId, dateOfBirth, contractDate, isVip, city);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractId=" + contractId +
                ", dateOfBirth=" + dateOfBirth +
                ", contractDate=" + contractDate +
                ", isVip=" + isVip +
                ", city='" + city + '\'' +
                '}';
    }
}
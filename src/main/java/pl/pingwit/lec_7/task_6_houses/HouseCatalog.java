package pl.pingwit.lec_7.task_6_houses;

import java.util.Arrays;

public class HouseCatalog {
    private String city;
    private String district;
    private House[] houses;

    public HouseCatalog(String city, String district, House[] houses) {
        this.city = city;
        this.district = district;
        this.houses = houses;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "HousesCatalog{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", houses=" + Arrays.toString(houses) +
                '}';
    }
}
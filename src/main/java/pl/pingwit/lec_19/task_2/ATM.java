package pl.pingwit.lec_19.task_2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// попробуй для этого класса исопльзовать record
@JsonIgnoreProperties(ignoreUnknown = true)
public class ATM { // ATM -> Atm
    private long id;
    private String area;
    private String city;
    private String addressType;
    private String address;
    private String house;
    private String workTime;
    private String currency;
    private boolean cashIn;

    public ATM(long id, String area, String city, String addressType, String address, String house, String workTime, String currency, boolean cashIn) {
        this.id = id;
        this.area = area;
        this.city = city;
        this.addressType = addressType;
        this.address = address;
        this.house = house;
        this.workTime = workTime;
        this.currency = currency;
        this.cashIn = cashIn;
    }

    public ATM() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isCashIn() {
        return cashIn;
    }

    public void setCashIn(boolean cashIn) {
        this.cashIn = cashIn;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "id=" + id +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", addressType='" + addressType + '\'' +
                ", address='" + address + '\'' +
                ", house='" + house + '\'' +
                ", workTime='" + workTime + '\'' +
                ", currency='" + currency + '\'' +
                ", cashIn=" + cashIn +
                '}';
    }
}

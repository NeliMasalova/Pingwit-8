package pl.pingwit.lec_6.Task_2_ParkingSystem;

public class CarOwnerInformation {
    private String carOwnerName;
    private String carOwnerSurname;
    private String carOwnerTelephone;
    private String carOwnerEmailAddress;

    public String getCarOwnerName() {
        return carOwnerName;
    }

    public void setCarOwnerName(String carOwnerName) {
        this.carOwnerName = carOwnerName;
    }

    public String getCarOwnerSurname() {
        return carOwnerSurname;
    }

    public void setCarOwnerSurname(String carOwnerSurname) {
        this.carOwnerSurname = carOwnerSurname;
    }

    public String getCarOwnerTelephone() {
        return carOwnerTelephone;
    }

    public void setCarOwnerTelephone(String carOwnerTelephone) {
        this.carOwnerTelephone = carOwnerTelephone;
    }

    public String getCarOwnerEmailAddress() {
        return carOwnerEmailAddress;
    }

    @Override
    public String toString() {
        return "CarOwnerInformation{" +
                "carOwnerName='" + carOwnerName + '\'' +
                ", carOwnerSurname='" + carOwnerSurname + '\'' +
                ", carOwnerTelephone='" + carOwnerTelephone + '\'' +
                ", carOwnerEmailAddress='" + carOwnerEmailAddress + '\'' +
                '}';
    }

    public void setCarOwnerEmailAddress(String carOwnerEmailAddress) {
        this.carOwnerEmailAddress = carOwnerEmailAddress;
    }
}
package pl.pingwit.lec_6.Task_2_ParkingSystem;

public class CarOwnerInformation {
    private String carOwnerName; // carOwnerName -> name
    private String carOwnerSurname; //surname
    private String carOwnerTelephone; //phone
    private String carOwnerEmailAddress; // email

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

    // метод toString всегда в конце самом, после equals+hashcode (coming soon)
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

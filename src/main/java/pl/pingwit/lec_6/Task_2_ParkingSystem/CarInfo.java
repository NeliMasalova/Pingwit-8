package pl.pingwit.lec_6.Task_2_ParkingSystem;

public class CarInfo {
    private String registrationNumber;
    private OwnerInformation ownerInformation;

    public CarInfo(String registrationNumber, OwnerInformation ownerInformation) {
        this.registrationNumber = registrationNumber;
        this.ownerInformation = ownerInformation;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public OwnerInformation getOwnerInformation() {
        return ownerInformation;
    }

    public void setOwnerInformation(OwnerInformation ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", ownerInformation=" + ownerInformation +
                '}';
    }
}
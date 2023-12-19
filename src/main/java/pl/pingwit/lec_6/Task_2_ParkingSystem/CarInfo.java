package pl.pingwit.lec_6.Task_2_ParkingSystem;

public class CarInfo {
    private String vehicleRegistrationNumber;
    private CarOwnerInformation carOwnerInformation;

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }

    public CarOwnerInformation getCarOwnerInformation() {
        return carOwnerInformation;
    }

    public void setCarOwnerInformation(CarOwnerInformation carOwnerInformation) {
        this.carOwnerInformation = carOwnerInformation;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "vehicleRegistrationNumber='" + vehicleRegistrationNumber + '\'' +
                ", carOwnerInformation=" + carOwnerInformation +
                '}';
    }

    public CarInfo(String vehicleRegistrationNumber, CarOwnerInformation carOwnerInformation) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
        this.carOwnerInformation = carOwnerInformation;
    }
}
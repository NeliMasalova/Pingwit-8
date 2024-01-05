package pl.pingwit.lec_8.Ferry;

public class CheckFerryAccess {

    public static final int MAX_PASSENGERS_NUMBER = 50;
    public static final int MAX_WEIGHT = 15;

    public static Boolean checkAccess(Vehicle[] vehicles) {
        boolean isAllowed = true;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getBoardPeople() <= MAX_PASSENGERS_NUMBER && vehicles[i].getWeight() < MAX_WEIGHT) {
                isAllowed = true;
                System.out.println(vehicles[i].getType() + " " + vehicles[i].getLicensePlate() + " " + "the access is allowed.");
            } else {
                System.out.println(vehicles[i].getType() + " " + vehicles[i].getLicensePlate() + " " + "the access is forbidden.");
                isAllowed = false;
            }
        }
        return isAllowed;
    }
}
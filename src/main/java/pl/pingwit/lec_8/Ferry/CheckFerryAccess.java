package pl.pingwit.lec_8.Ferry;

public class CheckFerryAccess {
    // public -> private для констант, метод не трогай
    private static final int MAX_PASSENGERS_NUMBER = 50;
    private static final int MAX_WEIGHT = 15;

    // в этом методе тебе необходимо посчитать всех пассажиров в машинах и общий вес авто. И затем принять решение в допуске или отказе. Ты пока проверяешь для каждого отдельного автомобиля
    public  Boolean checkAccess(Vehicle[] vehicles) { // убери у метода static
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

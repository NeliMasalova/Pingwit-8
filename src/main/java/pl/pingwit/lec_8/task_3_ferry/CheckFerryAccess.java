package pl.pingwit.lec_8.task_3_ferry;

public class CheckFerryAccess {
    private static final int MAX_PASSENGERS_NUMBER = 50;
    private static final int MAX_WEIGHT = 15;

    // в этом методе тебе необходимо посчитать всех пассажиров в машинах и общий вес авто. И затем принять решение в допуске или отказе. Ты пока проверяешь для каждого отдельного автомобиля
    public Boolean checkAccess(Vehicle[] vehicles) {
        boolean isAllowed = true;
        int totalPassengers = 0;
        int totalWeight = 0;
        for (Vehicle vehicle : vehicles) {
            totalPassengers += vehicle.getBoardPeople();
            totalWeight += vehicle.getWeight();
            isAllowed = totalPassengers <= MAX_PASSENGERS_NUMBER && totalWeight < MAX_WEIGHT;
        }
        return isAllowed;
    }
}

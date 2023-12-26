package pl.pingwit.lec_7.Cars;

public class OpenDoors {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Audi", "A3", 4),
                new Car("Audi", "A4", 5),
                new Car("Toyota", "Tundra", 5),
                new Car("Nissan", "Micra", 3),
                new Car("Audi", "SQ5Sportback", 5),
        };
        openDoors(cars);
    }

    private static void openDoors(Car[] differentCars) {
        for (Car differentCar : differentCars) {
            if (differentCar.getBrand().equals("Audi") && differentCar.getDoors() != 0) {
                for (int j = 1; differentCar.getDoors() >= j; j++) {
                    System.out.println(differentCar.getBrand() + " " + differentCar.getModel() + " " + "the door " + j + " is opened" + ".");
                }
            }
        }
    }
}
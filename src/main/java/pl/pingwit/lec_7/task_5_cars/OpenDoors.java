package pl.pingwit.lec_7.task_5_cars;

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
    private static void openDoors(Car[] cars) {
        for (Car car : cars) {
            if (car.getBrand().equals("Audi")) {
                for (int j = 1; car.getDoors() >= j; j++)
                    System.out.println(car.getBrand() + " " + car.getModel() + " " + "the door " + j + " is opened" + ".");
                }
            }
        }
    }
package pl.pingwit.lec_7.Cars; // название пакета должно быть с маленькой буквы

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

    private static void openDoors(Car[] differentCars) { // differentCars -> cars
        for (Car differentCar : differentCars) { // differentCar -> car
            if (differentCar.getBrand().equals("Audi") && differentCar.getDoors() != 0) { // differentCar.getDoors() != 0, это технически верная проверка, но в данном кейсе логичнее '> 0'
                for (int j = 1; differentCar.getDoors() >= j; j++) { // int j = 1 т.к. ты цикл начинаешь с 1, то проверку на кол-во дверей можно убрать. У тебя итак цикл не побежит если у машины 0 дверей
                    System.out.println(differentCar.getBrand() + " " + differentCar.getModel() + " " + "the door " + j + " is opened" + ".");
                }
            }
        }
    }
}

package pl.pingwit.lec_20.task_4;

import java.math.BigDecimal;

public class HouseMain {
    public static void main(String[] args) {

        House<String> firstHouse = new House<>("It's a generic string");
        House<Long> secondHouse = new House<>(123789654L);
        House<BigDecimal> thirdHouse = new House<>(new BigDecimal(10.58));
        House<Boolean> fourthHouse = new House<>(true);

        firstHouse.printType();
        secondHouse.printType();
        thirdHouse.printType();
        fourthHouse.printType();
    }
}
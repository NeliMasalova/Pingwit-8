package pl.pingwit.lec_20.task_4;

import java.math.BigDecimal;

public class GenericMain {
    public static void main(String[] args) {
        Generic<?> firstGeneric = new Generic<>("It's a generic string");
        Generic<?> secondGeneric = new Generic<>(123789654L);
        Generic<?> thirdGeneric = new Generic<>(new BigDecimal(10.58));
        Generic<?> fourthGeneric = new Generic<>(true);

        firstGeneric.printType();
        secondGeneric.printType();
        thirdGeneric.printType();
        fourthGeneric.printType();
    }
}
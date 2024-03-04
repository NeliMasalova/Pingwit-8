package pl.pingwit.lec_20.task_4;

import java.math.BigDecimal;

public class GenericMain {
    public static void main(String[] args) {
        // с wild card (?) это ты сильно конечно, но этот механизм для другого
        Generic<?> firstGeneric = new Generic<>("It's a generic string"); // Generic<?> -> Generic<String>
        Generic<?> secondGeneric = new Generic<>(123789654L); // Generic<?> -> Generic<Long>
        Generic<?> thirdGeneric = new Generic<>(new BigDecimal(10.58)); // Generic<?> -> Generic<BigDecimal>
        Generic<?> fourthGeneric = new Generic<>(true); // угадай :)

        firstGeneric.printType();
        secondGeneric.printType();
        thirdGeneric.printType();
        fourthGeneric.printType();
    }
}

package pl.pingwit.lec_20.task_4;

import java.math.BigDecimal;

public class GenericMain {
    public static void main(String[] args) {
        Generic<String> stringGeneric = new Generic<>("It's a generic string");
        Generic<Long> longGeneric = new Generic<>(123789654L);
        Generic<BigDecimal> bigDecimalGeneric = new Generic<BigDecimal>(new BigDecimal(10.58));
        Generic<Boolean> booleanGeneric = new Generic<>(true);

        stringGeneric.printType();
        longGeneric.printType();
        booleanGeneric.printType();
        bigDecimalGeneric.printType();
    }
}
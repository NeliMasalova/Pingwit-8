package pl.pingwit.lec_9;

import java.util.Arrays;
import java.util.Objects;

public final class BankWarehouse {
    private final DepositBox[] depositBoxes;
    private final String name;
    private int index = 0;

    public BankWarehouse(DepositBox[] depositBoxes, String name) {
        this.depositBoxes = Arrays.copyOf(depositBoxes, depositBoxes.length);
        this.name = name;
    }

    public DepositBox next() { // в этот метод можем еще добавить проверку что depositBoxes не пустой массив, чтобы избежать IndexArray...
        DepositBox depositBox = depositBoxes[index];
        index++;
        if (index == depositBoxes.length) {
            index = 0;
        }
        return depositBox;
    }

    public DepositBox[] depositBoxes() { // вот здесь тоже клон надо возвращать
        return depositBoxes;
    }

    public String name() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankWarehouse warehouse = (BankWarehouse) o;
        return Arrays.equals(depositBoxes, warehouse.depositBoxes) && Objects.equals(name, warehouse.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(depositBoxes);
        return result;
    }

    @Override
    public String toString() {
        return "BankWarehouse{" +
                "depositBoxes=" + Arrays.toString(depositBoxes) +
                ", name='" + name + '\'' +
                '}';
    }
}

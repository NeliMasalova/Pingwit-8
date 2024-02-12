package pl.pingwit.lec_9;

import java.util.Arrays;

public final class DepositBox {
    private final int id;
    private final String password;
    private final Valuable[] valuables;

    public DepositBox(int id, String password, Valuable[] valuables) {
        this.id = id;
        this.password = password;
        this.valuables = Arrays.copyOf(valuables, valuables.length);
    }

    public int getId() {
        return id;
    }

    public Valuable[] getValuables() {
        return Arrays.copyOf(valuables, valuables.length);
    }

    public Valuable[] extractValuables(String password) {
        if (this.password.equals(password)) {
            return Arrays.copyOf(valuables, valuables.length);
        } else {
            return new Valuable[0];
        }
    }

    @Override
    public String toString() {
        return "DepositBox{" +
                "boxId=" + id +
                ", password='" + password + '\'' +
                ", valuablesList=" + Arrays.toString(valuables) +
                '}';
    }
}
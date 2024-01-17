package pl.pingwit.lec_9;

public class Valuable {
    private final String name;

    public Valuable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Valuable{" +
                "name='" + name + '\'' +
                '}';
    }
}

package pl.pingwit.lec_20.task_4;

public class House<T> {
    private T value;

    public House(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void printType() {
        System.out.println("The type of variable is " + value.getClass().getName() + ".");
    }
}
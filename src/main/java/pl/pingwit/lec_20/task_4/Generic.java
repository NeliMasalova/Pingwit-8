package pl.pingwit.lec_20.task_4;

public class Generic<T> { // Generic -> MyGeneric хотя бы, а лучше House или любое другое адекваное название или неадекватное, но другое, не используй зарезервированные названия
    private T value;

    public Generic(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void printType() {
        System.out.println("The type of variable is " + value.getClass().getName() + ".");
    }
}

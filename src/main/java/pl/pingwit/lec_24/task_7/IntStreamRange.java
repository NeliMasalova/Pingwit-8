package pl.pingwit.lec_24.task_7;

import java.util.stream.IntStream;

public class IntStreamRange {
    public static void main(String[] args) {
        IntStream range = IntStream.range(50, 150);
        IntStream intStream = range.filter(number -> number % 7 == 0);
        intStream.forEach(System.out::println);
    }
}
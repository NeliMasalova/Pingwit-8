package pl.pingwit.part_25.task_3;

import java.util.List;
import java.util.Optional;

public class FilterFindFirst {

    public static final int MAX_NUMBER = 22;

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, -18, -22, 98, 4, 15, 123);

        Optional<Integer> resultNumbers = integers.stream()
                .filter(number -> number > MAX_NUMBER)
                .findFirst();

        System.out.println(resultNumbers);
    }
}
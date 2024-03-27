package pl.pingwit.lec_24.task_8;

import java.util.List;
import java.util.function.Function;

public class MappingIntToString {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 18, 94, 1000005, -15, 0, 33);

        Function<Integer, String> mappingIntegerToString = number -> (number) + " руб."; // я думаю ты готова пострадать и сделать вариант без сокращения до "руб."

        List<String> resultStrings = integers.stream()
                .map(mappingIntegerToString)
                .toList();

        resultStrings.forEach(System.out::println);
    }
}
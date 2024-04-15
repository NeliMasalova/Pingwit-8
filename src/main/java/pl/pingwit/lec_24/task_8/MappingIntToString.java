package pl.pingwit.lec_24.task_8;

import java.util.List;
import java.util.function.Function;

public class MappingIntToString {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 18, 92, 1000005, 15, 0, 33, 12);

        List<String> strings = integers.stream()
                .map(element -> element.toString())
                .toList();

        Function<String, String> mappingIntegerToString = number -> {
            String ending = " рублей.";
            if (number.endsWith("1")) {
                ending = " рубль.";
            } else if (number.endsWith("12") || number.endsWith("13") || number.endsWith("14")) {
                ending = " рублей.";
            } else if (number.endsWith("2") || number.endsWith("3") || number.endsWith("4")) {
                ending = " рубля.";
            }
            return number + ending;
        };

        strings.stream()
                .map(mappingIntegerToString)
                .forEach(System.out::println);

    }
}
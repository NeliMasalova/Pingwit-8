package pl.pingwit.lec_24.task_8;

import java.util.List;
import java.util.function.Function;

//аписать функцию перевода числа в строку с добавлением денежной единицы. Например, 5 -> 5 рублей.
//Если получится, то учесть правильность окончаний, если нет, то можно сократить до "руб".
public class MappingIntToString {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 18, 94, 1000005, -15, 0);

        Function<Integer, String> mappingIntegerToString = number -> String.valueOf(number) + " руб.";

        List<String> resultStrings = integers.stream()
                .map(mappingIntegerToString)
                .toList();

        resultStrings.forEach(System.out::println);
    }
}
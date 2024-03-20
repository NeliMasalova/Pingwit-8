package pl.pingwit.part_25.task_1;

import java.util.ArrayList;
import java.util.List;


public class Filter {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("");
        strings.add("          ");
        strings.add("Hello world!");
        strings.add("Гэта Беларусь!");
        strings.add("I love my job, I love my job");
        strings.add("123");

        List<String> resultStrings = strings.stream()
                .filter(string -> string.length() > 5)
                .toList();
        resultStrings.forEach(System.out::println);
    }
}
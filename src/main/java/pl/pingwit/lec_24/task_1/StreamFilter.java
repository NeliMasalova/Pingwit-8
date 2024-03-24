package pl.pingwit.lec_24.task_1;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {

    public static final int LENGTH_CONDITION = 5;

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Напозорился на собеседовании и спит.");
        strings.add("NullPointerException");
        strings.add("");
        strings.add("Hello world!");
        strings.add("I");
        strings.add("love");
        strings.add("my");
        strings.add("job! (no)");

        List<String> resultStrings = strings.stream()
                .filter(x -> x.length() > LENGTH_CONDITION)
                .toList();

        resultStrings.forEach(System.out::println);
    }
}

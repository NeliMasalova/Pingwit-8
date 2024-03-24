package pl.pingwit.lec_24.task_10;

import java.util.ArrayList;
import java.util.Comparator;

public class LambdaComparator {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("adfdf");
        strings.add("b");
        strings.add("efqc");
        strings.add("fq3rgrd");
        strings.add("e");
        strings.add("k");

        Comparator<String> reverseComparator = ((s1, s2) -> s2.compareTo(s1));

        strings.sort(reverseComparator);

        for (String str : strings) {
            System.out.println(str);
        }
    }
}
package pl.pingwit.part_26.task_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Piter", "Parker", 99),
                new Student("Piter", "Fisher", 58),
                new Student("Sherlock", "Holmes", 100),
                new Student("Anna", "Gawalda", 77),
                new Student("Anna", "Bolein", 95),
                new Student("Tony", "Stark", 100),
                new Student("Tony", "Black", 78));

        Map<String, Double> averageStudentsScore = students.stream()
                .collect(Collectors.groupingBy(Student::name,
                        Collectors.averagingInt(Student::score)));

        System.out.println(averageStudentsScore);
    }
}
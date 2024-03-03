package pl.pingwit.lec_15.task_2;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonParser {
    public Person[] parsePerson(String string) throws DateTimeException {
        String[] personData = string.replaceAll(" ", "").split(";");
        Person[] persons = new Person[personData.length];

        for (int i = 0; i < personData.length; i++) {
            String[] parts = personData[i].split(",");
            String name = parts[0];
            String surname = parts[1];
            DayOfWeek favouriteDay = DayOfWeek.of(Integer.parseInt(parts[2]));
            LocalDate birthDate = LocalDate.parse(parts[3], DateTimeFormatter.ofPattern("yyyy-dd-MM"));

            persons[i] = new Person(name, surname, birthDate, favouriteDay);
        }
        return persons;
    }
}
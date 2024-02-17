package pl.pingwit.lec_15.task_2;

import java.time.DateTimeException;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String string = "Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";

        PersonParser personParser = new PersonParser();
        System.out.println(Arrays.toString(personParser.parsePerson(string)));

        String secondString = "Fedor, Petrov, 7, 1980-25-02; Maks, Ermolaev, 12, 1987-02-03; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";
        try {
            personParser.parsePerson(secondString);
        } catch (DateTimeException e) {
            System.out.println(e);
        }
    }
}
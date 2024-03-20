package pl.pingwit.lec_21.task_5;

import java.util.ArrayList;

public class RetainAll {
    public static void main(String[] args) {
        ArrayList<String> allFilms = new ArrayList<>();
        ArrayList<String> oldFilms = new ArrayList<>();

        allFilms.add("Harry Potter and the Goblet of Fire");
        allFilms.add("The Lord of the Rings: the return of the King");
        allFilms.add("Terminator 2: Judgment Day");
        allFilms.add("Avengers: Infinity War");

        oldFilms.add("Avengers: Infinity War");
        oldFilms.add("Star Wars: Episode I – The Phantom Menace");
        oldFilms.add("The Lord of the Rings: the return of the King");
        oldFilms.add("The Lion King");

        allFilms.retainAll(oldFilms);
        System.out.println(allFilms);
    }
}
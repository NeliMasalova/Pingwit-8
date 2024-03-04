package pl.pingwit.lec_21.task_4;

import java.util.ArrayList;

public class RemoveAll {
    public static void main(String[] args) {
        ArrayList<String> cinema1 = new ArrayList<>(); // cinema1 - allFilms
        ArrayList<String> cinema2 = new ArrayList<>(); // cinema2 - oldFilms, хватит уже использовать названия с цифрами

        cinema1.add("Harry Potter and the Goblet of Fire");
        cinema1.add("The Lord of the Rings: the return of the King");
        cinema1.add("Terminator 2: Judgment Day");
        cinema1.add("Avengers: Infinity War");

        cinema2.add("Avengers: Infinity War");
        cinema2.add("Star Wars: Episode I – The Phantom Menace");
        cinema2.add("The Lord of the Rings: the return of the King");
        cinema2.add("The Lion King");

        cinema1.removeAll(cinema2);
        System.out.println(cinema1);
    }
}

package pl.pingwit.lec_7.PersonInfo;

import java.util.Arrays;

public class PersonStatic {
    public static void main(String[] args) {
        Person harryPotter = new Person("Harry Potter", 17);
        Person volandemort = new Person("Lord Volandemort", 71);
        System.out.println(harryPotter + Person.getText());
        System.out.println(volandemort + Person.getText());
    }
}
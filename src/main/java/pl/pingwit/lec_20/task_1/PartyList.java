package pl.pingwit.lec_20.task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<>();
        guests.add("Piter Parker");
        guests.add("Tony Stark");
        guests.add("Bruce Banner");
        guests.add("Dr. Stephen Strange");
        guests.add("Steve Rogers");
        guests.add("Natasha Romanoff");
        guests.add("Thor");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, say your full name");
        String guestName = scanner.nextLine();

        if (guests.contains(guestName)) {
            System.out.println("You are welcome!");
        } else {
            System.out.println("Sorry, not today.");// просто обидно:)
        }
    }
}

package pl.pingwit.lec_20.task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {
        ArrayList<String> guestList = new ArrayList<>();
        guestList.add("Piter Parker");
        guestList.add("Tony Stark");
        guestList.add("Bruce Banner");
        guestList.add("Dr. Stephen Strange");
        guestList.add("Steve Rogers");
        guestList.add("Natasha Romanoff");
        guestList.add("Thor");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, say your full name");
        String guestName = scanner.nextLine();

        if (guestList.contains(guestName)) {
            System.out.println("You are welcome!");
        } else {
            System.out.println("Sorry, not today.");
        }
    }
}
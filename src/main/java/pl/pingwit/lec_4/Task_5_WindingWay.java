package pl.pingwit.lec_4;

import java.util.Scanner;

public class Task_5_WindingWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease, enter the way time in seconds: ");
        int wayTime = scanner.nextInt();
        int waySize = 9;
        long finishTime = System.currentTimeMillis() + (wayTime * 1000L);
        while (System.currentTimeMillis() < finishTime) {
            for (int i = 0; i <= waySize; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("||  |  ||");
            }
            for (int i = waySize; i >= 0; i--) {
                for (int j = i; j >= 0; j--) {
                    System.out.print(" ");
                }
                System.out.println("||  |  ||");
            }
        }
    }
}
package pl.pingwit.lec_4;

import java.util.Scanner;

public class Task_4_Butterfly {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please, enter the butterfly's size from 1 to 9: ");
        int butterflySize = 5;
        for (int i = 1; i <= butterflySize; i++) {
            int cursor = 1;
            for (int k = 1; k <= butterflySize * 2; k++) {
                if (k <= i || k > butterflySize * 2 - i) {
                    System.out.print(cursor);
                } else {
                    System.out.print(" ");
                }
                if (k < butterflySize) {
                    cursor++;
                }
                if (k > butterflySize) {
                    cursor--;
                }
            }
            System.out.println();
        }

        int rightBorder = butterflySize;
        int leftBorder = butterflySize;
        for (int i = 1; i <= butterflySize; i++) {
            int cursor = 1;
            for (int k = 1; k <= butterflySize * 2; k++) {
                if (k <= leftBorder || k > rightBorder) {
                    System.out.print(cursor);
                } else {
                    System.out.print(" ");
                }

                if (k < butterflySize) {
                    cursor++;
                }
                if (k > butterflySize) {
                    cursor--;
                }
            }
            leftBorder--;
            rightBorder++;
            System.out.println();
        }
    }
}
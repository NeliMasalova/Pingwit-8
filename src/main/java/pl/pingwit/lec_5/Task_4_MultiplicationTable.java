package pl.pingwit.lec_5;

import java.util.Arrays;

public class Task_4_MultiplicationTable {
    public static void main(String[] args) {
        int[][] myIntArray = new int[10][10];
        for (int i = 0; i < myIntArray.length; i++) {
            for (int j = 0; j < myIntArray.length; j++) {
                myIntArray[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4s", myIntArray[i][j]);
            }
            System.out.println();
        }
    }
}
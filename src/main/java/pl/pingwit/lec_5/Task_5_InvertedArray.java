package pl.pingwit.lec_5;

import java.util.Arrays;

public class Task_5_Inverse {
    public static void main(String[] args) {
        int[] myIntArray = {0, 1, 2, 3, 4};
        int[] inverseArray = new int[myIntArray.length];
        for (int i = 0; i < myIntArray.length; i++) {
            inverseArray[i] = myIntArray[myIntArray.length - i - 1];
        }
        System.out.println(Arrays.toString(inverseArray));
    }
}
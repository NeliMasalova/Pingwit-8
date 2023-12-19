package pl.pingwit.lec_5;

import java.util.Arrays;

public class Task_3_TheReplacingOddNumbers {
    public static void main(String[] args) {
        int[] myIntArray = {15, 35, 78, 96, 13, 44, 22, 30, 900};
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] % 2 != 0) {
                myIntArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myIntArray));
    }
}
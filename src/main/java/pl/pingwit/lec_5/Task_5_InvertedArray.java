package pl.pingwit.lec_5;

import java.util.Arrays;

public class Task_5_InvertedArray {
    public static void main(String[] args) {
        int[] myIntArray = {};
        for (int i = 0; i < myIntArray.length / 2; i++) {
            int temp = myIntArray[i];
            myIntArray[i] = myIntArray[myIntArray.length - i - 1];
            myIntArray[myIntArray.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(myIntArray));
    }
}
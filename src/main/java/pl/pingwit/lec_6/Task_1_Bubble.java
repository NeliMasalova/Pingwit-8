package pl.pingwit.lec_6;

import java.util.Arrays;

public class Task_1_Bubble {
    public static void main(String[] args) {
        int[] myIntArray = {5, 19, 22, -4, 1023, 7, 1993, -52, 98};
        int myTemporaryInt = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            for (int j = 0; j < (myIntArray.length - 1) - i; j++) {
                if (myIntArray[j] > myIntArray[j + 1]) {
                    myTemporaryInt = myIntArray[j];
                    myIntArray[j] = myIntArray[j + 1];
                    myIntArray[j + 1] = myTemporaryInt;
                }
            }
        }
        System.out.println(Arrays.toString(myIntArray));
    }
}
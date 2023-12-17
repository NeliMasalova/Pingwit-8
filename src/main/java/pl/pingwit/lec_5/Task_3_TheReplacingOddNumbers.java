package pl.pingwit.lec_5;

import java.util.Arrays;

public class Task_3_TheReplacingOddNumbers {
    public static void main(String[] args) {
        int[] myIntArray = {7, 15, 23, 44, 82, 91};
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] % 2 != 0) {
                myIntArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myIntArray));
    }
}

package pl.pingwit.lec_5;

import java.util.Arrays;

public class Task_6_FromOneArrayToAnother {
    public static void main(String[] args) {
        int[] myIntArray = {1, 12, 2, 63, 95, 44, 74, 110, 2450};
        int[] evenNumbersArray = new int[myIntArray.length];
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] % 2 == 0) {
                evenNumbersArray[i] = myIntArray[i];
            }
        }
        // а 3ий финальный массив?
        System.out.println(Arrays.toString(evenNumbersArray));
    }
}

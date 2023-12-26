package pl.pingwit.lec_5;

import java.util.Arrays;

public class Task_6_FromOneArrayToAnother {
    public static void main(String[] args) {
        int[] array = {1, 12, 2, 63, 95, 44, 74, 110, 2450};
        int[] evenNumbersTempArray = new int[array.length];
        int evenNumbersCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbersTempArray[i] = array[i];
                evenNumbersCounter++;
            }
        }

        int[] evenNumbersFinalArray = new int[evenNumbersCounter];
        int index = 0;
        for (int i : evenNumbersTempArray) {
            if (i != 0) {
                evenNumbersFinalArray[index] = i;
                index++;
            }
        }
        System.out.println(evenNumbersCounter);
        System.out.println(Arrays.toString(evenNumbersFinalArray));
    }
}
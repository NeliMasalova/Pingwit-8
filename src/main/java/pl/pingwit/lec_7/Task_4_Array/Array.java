package pl.pingwit.lec_7.Task_4_Array;

import java.util.Arrays;

public class Array {
    public static final int MULTIPLAYER = 5;
    public static void main(String[] args) {
        int[] array = {-3, -2, 0, -7, -8, -9, -10};
        printArray(array);
    }

    private static void printArray(int[] sourceArray) {
        int[] array = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] % 2 == 0) {
                array[i] = sourceArray[i] * MULTIPLAYER;
            } else {
                array[i] = sourceArray[i];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

package pl.pingwit.lec_5;

import java.util.Arrays;

public class Task_5_InvertedArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
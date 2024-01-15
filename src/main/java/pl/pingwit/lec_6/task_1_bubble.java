package pl.pingwit.lec_6;

import java.util.Arrays;

public class task_1_bubble {
    public static void main(String[] args) {
        int[] array = {5, 19, 22, -4, 1023, 7, 1993, -52, 98};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
package pl.pingwit.lec_7.Task_4_Array;

import java.util.Arrays;

public class Array {
    public static final int CHANGED_CONDITION = 5; // CHANGED_CONDITION грозное название, думаю MULTIPLIER или EVEN_MULTIPLIER сюда лучше подойдет

    public static void main(String[] args) {
        int[] array = {-3, -2, 0, -7, -8, -9, -10};
        PrintArray(array);
    }

    private static void PrintArray(int[] sourceArray) { // PrintArray - название метода с маленькой буквы
        int[] array = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] % 2 == 0) {
                array[i] = sourceArray[i] * CHANGED_CONDITION;
            } else {
                array[i] = sourceArray[i];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

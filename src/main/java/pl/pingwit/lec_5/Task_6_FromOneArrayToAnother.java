package pl.pingwit.lec_5;

import java.util.Arrays;

//Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
public class Task_6 {
    public static void main(String[] args) {
        int[] myIntArray = {1, 12, 2, 63, 95, 44, 74, 110, 2450};
        int[] secondIntArray = new int[myIntArray.length];
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] % 2 == 0) {
                secondIntArray[i] = myIntArray[i];
            }
        }
        System.out.println(Arrays.toString(secondIntArray));
    }
}

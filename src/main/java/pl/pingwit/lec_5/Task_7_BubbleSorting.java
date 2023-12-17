package pl.pingwit.lec_5;

import java.util.Arrays;

public class Task_7_BubbleSorting {
    public static void main(String[] args) {
        int[] myArray = {11, 84, 2, 75, 10, 123, 7, 5, -3};
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    int temporaryInt = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temporaryInt;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
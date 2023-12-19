package pl.pingwit.lec_5;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1_TheUserArray {
    public static void main(String[] args) {
        Scanner myScannerArray = new Scanner(System.in);
        int[] myIntArray = new int[3];
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Please, enter the number: ");
            myIntArray[i] = myScannerArray.nextInt();
        }
        int min = myIntArray[0];
        int max = myIntArray[0];
        int sum = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            sum += myIntArray[i];
            if (myIntArray[i] < min) {
                min = myIntArray[i];
            }
            if (myIntArray[i] > max) {
                max = myIntArray[i];
            }

        }

        System.out.println("The sum of numbers in your array is " + sum + ".");
        System.out.println("A maximum number in your array is " + max + ".");
        System.out.println("A minimum number in your array is " + min + ".");
    }
}
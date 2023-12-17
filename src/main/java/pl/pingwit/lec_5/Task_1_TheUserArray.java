package pl.pingwit.lec_5;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1_TheUserArray {
    public static void main(String[] args) {
        Scanner myScannerArray = new Scanner(System.in);
        int[] myIntArray = new int[3];
        int sum = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Please, enter the number: ");
            myIntArray[i] = myScannerArray.nextInt();
            sum += myIntArray[i];
        }

        Arrays.sort(myIntArray);
        int maxNumberInArray = myIntArray[2];
        int minNumberInArray = myIntArray[0];

        System.out.println("The sum of numbers in your array is " + sum + ".");
        System.out.println("A maximum number in your array is " + maxNumberInArray + ".");
        System.out.println("A minimum number in your array is " + minNumberInArray + ".");
    }
}
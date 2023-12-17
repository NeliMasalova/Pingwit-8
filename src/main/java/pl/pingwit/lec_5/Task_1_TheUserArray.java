package pl.pingwit.lec_5;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner myScannerArray = new Scanner(System.in);
        int[] myIntArray = new int[3];
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Please, enter the number: ");
            myIntArray[i] = myScannerArray.nextInt();
        }
        Arrays.sort(myIntArray);
        int maxNumberInArray = myIntArray[2];
        int minNumberInArray = myIntArray[0];
        int sumOfNumbers = myIntArray[0] + myIntArray[1] + myIntArray[2];
        System.out.println("A maximum number in your array is " + maxNumberInArray + ".");
        System.out.println("A minimum number in your array is " + minNumberInArray + ".");
        System.out.println("The sum of numbers in your array is " + sumOfNumbers + ".");
    }
}
package pl.pingwit.lec_8;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the line: ");
        String string = scanner.nextLine();
        char[] array = string.toCharArray();
        char[] invertedArray = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            invertedArray[i] = array[array.length - i - 1];
        }

        if (Arrays.equals(array, invertedArray)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}
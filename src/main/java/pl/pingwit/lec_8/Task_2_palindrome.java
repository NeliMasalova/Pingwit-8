package pl.pingwit.lec_8;

import java.util.Scanner;

// для этой задачи создай пакет task_2, а сам класс переименуй в Palindrome
public class Task_2_palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the line: ");
        String string = scanner.nextLine();
        char[] array = string.toCharArray(); // давай попробуем удалить массив, а у переменной string вызвать метод charAt(сюда передаем i)
        boolean isPalindrome = false;
        for (int i = 0; i < array.length / 2; i++) {
            isPalindrome = array[i] == array[array.length - i - 1];
        }
        if (isPalindrome) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome!");
        }
    }
}

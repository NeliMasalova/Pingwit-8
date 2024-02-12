package pl.pingwit.lec_10.task_2_palindrome;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the line: ");
        String string = scanner.nextLine();

        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.isPalindrome(string);
        if (isPalindrome) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }

    public boolean isPalindrome(String string) {
        return StringUtils.reverse(string).equals(string);
    }
}
package pl.pingwit.lec_3;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, enter the second number: ");
        int secondNumber = scanner.nextInt();

        int result = 0;

        for (int i=1; i<= firstNumber; i++){
            result += secondNumber;
        }
        System.out.println("Your result is " + result + ".");
    }
}
package pl.pingwit.lec_3;

public class Task_7_OddNumbers {
    public static void main(String[] args) {
        int sumOddNumbers = 0;
        for (int oddNumber = 1; oddNumber < 100; oddNumber++) {
            if (oddNumber % 2 != 0) {
                sumOddNumbers += oddNumber;
            }
        }
        System.out.println("The sum of odd numbers is " + sumOddNumbers + ".");
    }
}
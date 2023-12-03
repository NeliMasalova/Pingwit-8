package pl.pingwit.lec_3;
public class Task_8_TheSumsOfNumbers {
    public static void main(String[] args) {
        int sumOddNumbers = 0;
        int sumEvenNumbers = 0;
        int sumAllNumbers = 0;
        for (int evenNumber = 0; evenNumber <= 100; evenNumber = evenNumber + 2) {
            sumEvenNumbers += evenNumber;
        }
        for (int oddNumber = 1; oddNumber < 100; oddNumber = oddNumber + 2) {
            sumOddNumbers += oddNumber;
        }
        for (int number = 0; number <= 100; ++number) {
            sumAllNumbers += number;
        }
        System.out.println("The sum of odd numbers is " + sumOddNumbers + ".");
        System.out.println("The sum of even numbers is " + sumEvenNumbers + ".");
        System.out.println("The total sum of all numbers is " + sumAllNumbers + ".");
    }
}
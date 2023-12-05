package pl.pingwit.lec_3;

public class Task_7_OddNumbers {
    public static void main(String[] args) {
        // тоже абсолютно верно, просто для себя одну из этих задач сделай с использованием оператора %
        int sumOddNumbers = 0;
        for (int oddNumber = 1; oddNumber < 100; oddNumber = oddNumber + 2) {
            sumOddNumbers += oddNumber;
        }
        System.out.println("The sum of odd numbers is " + sumOddNumbers + ".");
    }
}

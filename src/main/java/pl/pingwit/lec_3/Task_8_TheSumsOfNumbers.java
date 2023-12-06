package pl.pingwit.lec_3;

public class Task_8_TheSumsOfNumbers {
    public static void main(String[] args) {
        int sumOddNumbers = 0;
        int sumEvenNumbers = 0;
        int sumAllNumbers = 0;

        //а теперь давай эти 3 цикла заменим одним и сразу все посчитаем. Тебе понадобится if() и оператор %
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEvenNumbers += i;
            }
            if (i % 2 != 0) {
                sumOddNumbers += i;
            }
            if (i % 1 == 0) {
                sumAllNumbers += i;
            }
        }
        System.out.println("The sum of odd numbers is " + sumEvenNumbers + ".");
        System.out.println("The sum of even numbers is " + sumOddNumbers + ".");
        System.out.println("The total sum of all numbers is " + sumAllNumbers + ".");
    }
}
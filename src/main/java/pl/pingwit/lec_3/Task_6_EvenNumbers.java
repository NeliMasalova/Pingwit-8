package pl.pingwit.lec_3;

public class Task_6_EvenNumbers {
    public static void main(String[] args) {
    // верное решение, но очень хотелось с использованием оператора %
        for (int evenNumber = 2; evenNumber <= 100; evenNumber = evenNumber + 2) {
            System.out.println(evenNumber);
        }
    }
}

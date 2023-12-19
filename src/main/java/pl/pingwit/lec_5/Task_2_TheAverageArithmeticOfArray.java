package pl.pingwit.lec_5;

public class Task_2_TheAverageArithmeticOfArray {
    public static void main(String[] args) {
        int[] myIntArray = {18, 35, -5, 17, 43, };
        int sum = 0;
        for (int v : myIntArray) {
            sum += v;
        }
        double average = sum / myIntArray.length;
        System.out.println("The average arithmetic number of array's elements is " + average + ".");
    }
}
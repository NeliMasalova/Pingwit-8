package pl.pingwit.lec_5;

public class Task_2_TheAverageArithmeticOfArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 10, 3, 98, -23102, 11};
        int sum = 0;
        for (int v : array) {
            sum += v;
        }
        if (array.length == 0) {
            System.out.println("Sorry, can't to count the average arithmetic of array, because the array is empty.");
        } else {
            double average = sum / array.length;
            System.out.println("The average arithmetic number of array's elements is " + average + ".");
        }
    }
}
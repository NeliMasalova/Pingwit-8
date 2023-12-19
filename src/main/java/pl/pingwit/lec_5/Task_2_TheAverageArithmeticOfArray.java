package pl.pingwit.lec_5;

public class Task_2_TheAverageArithmeticOfArray {
    public static void main(String[] args) {
        int[] myIntArray = {};
        int sum = 0;
        for (int v : myIntArray) {
            sum += v;
        }
        double average = (double) sum / myIntArray.length;

        if (myIntArray.length == 0) {
            System.out.println("Sorry, can't to count the average arithmetic of array, because the array is empty.");
        } else {
            System.out.println("The average arithmetic number of array's elements is " + average + ".");
        }
    }
}
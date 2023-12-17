package pl.pingwit.lec_5;

public class Task_2_TheAverageArithmeticOfArray {
    public static void main(String[] args) {
        double[] myIntArray = {15, 74, 39, 7, 25, 33, -2, 17, 0};
        double sum = 0;
        double average = 0;
        for (double v : myIntArray) {
            sum += v;
        }
        average += sum / myIntArray.length;
        System.out.println("The average arithmetic number of array's elements is " + average + ".");
    }
}
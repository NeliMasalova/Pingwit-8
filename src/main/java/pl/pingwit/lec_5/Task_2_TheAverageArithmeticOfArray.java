package pl.pingwit.lec_5;
//Task 2Task 2
//Есть массив чисел. Найти среднее арифметическое число элементов массива

public class Task_2 {
    public static void main(String[] args) {
        double[] myIntArray = {15, 74, 39, 7, 25, 33, -2, 17, 0};
        double sum = 0;
        double average = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            sum += myIntArray[i];
        }
        average += sum / myIntArray.length;
        System.out.println("The average arithmetic number of array's elements is " + average + ".");
    }
}

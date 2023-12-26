package pl.pingwit.lec_5;

public class Task_4_MultiplicationTable {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4s", array[i][j]);
            }
            System.out.println();
        }
    }
}
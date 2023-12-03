package pl.pingwit.lec_3;

public class Task_3_TheSum {
    public static void main(String[] args) {
        int myInt = 0;
        int myTotalInt = myInt;
        for (int i = 1; i <= 256; i = i * 2) {
            myTotalInt += myInt + i;
        }
        System.out.println(myTotalInt);
    }
}
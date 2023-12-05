package pl.pingwit.lec_3;

public class Task_3_TheSum {
    public static void main(String[] args) {
        int myInt = 0; // я думаю это переменную можно удалить
        int myTotalInt = myInt; // int myTotalInt = 0;
        for (int i = 1; i <= 256; i = i * 2) {
            myTotalInt += myInt + i; // myTotalInt += i;
        }
        System.out.println(myTotalInt);
    }
}

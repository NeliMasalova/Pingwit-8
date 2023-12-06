package pl.pingwit.lec_4;

public class Task_4_Butterfly {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
package pl.pingwit.lec_3;

public class Task_6_EvenNumbers {
    public static void main(String[] args) {
       /* for (int evenNumber = 2; evenNumber <= 100; evenNumber = evenNumber + 2) {
            System.out.println(evenNumber);
        }*/
        for (int evenNumber = 0; evenNumber <= 100; evenNumber++ ){
            if (evenNumber % 2 == 0){
                System.out.println(evenNumber);
            }
        }
    }
}
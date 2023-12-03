package pl.pingwit.lec_3;

public class Task_2_Amoeba {
    public static void main(String[] args) {
        int totalAmoeba = 1;
        for (int timeAmoebaReproduction = 3; timeAmoebaReproduction <= 24; timeAmoebaReproduction = timeAmoebaReproduction + 3) {
            totalAmoeba = totalAmoeba * 2;
            System.out.println("The total number of Amoebas every three hours is: " + totalAmoeba + ".");
        }
    }
}
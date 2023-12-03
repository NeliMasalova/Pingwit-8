package pl.pingwit.lec_3;

public class Task_1_Trainings {
    public static void main(String[] args) {
        double theFirstDayWay = 10.0;
        double totalWay = theFirstDayWay;
        for (double dayNumber = 2; dayNumber <= 7; dayNumber++) {
            theFirstDayWay = (theFirstDayWay * 0.1 + theFirstDayWay);
            totalWay += theFirstDayWay;
        }
        System.out.println("The total training way is " + totalWay + " kilometres.");
    }
}
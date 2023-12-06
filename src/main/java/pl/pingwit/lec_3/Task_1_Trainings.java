package pl.pingwit.lec_3;

public class Task_1_Trainings {
    public static void main(String[] args) {
        double dailyDistance = 10.0;
        double totalWay = dailyDistance;
        for (double dayNumber = 2; dayNumber <= 7; dayNumber++) {
            dailyDistance = (dailyDistance * 0.1 + dailyDistance);
            totalWay += dailyDistance;
        }
        System.out.println("The total training way is " + totalWay + " kilometers.");
    }
}
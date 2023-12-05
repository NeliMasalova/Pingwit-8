package pl.pingwit.lec_3;

public class Task_5_DistanceConversionTable {
    public static void main(String[] args) {
        for (int inchesDistance = 1; inchesDistance <= 20; ++inchesDistance) {
            double centimetresDistance = inchesDistance * 2.54; // 2.54 - это называется магическое число. Такие числа нужно выносить в отдельную переменную, чтобы было понятно для чего оно
            System.out.println("The distance " + inchesDistance + " in" + " = " + centimetresDistance + " cm.");
        }
    }
}

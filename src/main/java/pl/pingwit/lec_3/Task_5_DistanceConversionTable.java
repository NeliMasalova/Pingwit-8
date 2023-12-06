package pl.pingwit.lec_3;

public class Task_5_DistanceConversionTable {

    public static final double INCHES_VALUE_IN_CM = 2.54;

    public static void main(String[] args) {
        for (int inchesDistance = 1; inchesDistance <= 20; ++inchesDistance) {
            double centimetresDistance = inchesDistance * INCHES_VALUE_IN_CM;
            System.out.println("The distance " + inchesDistance + " in" + " = " + centimetresDistance + " cm.");
        }
    }
}
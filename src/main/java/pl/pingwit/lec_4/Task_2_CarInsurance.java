package pl.pingwit.lec_4;
import java.util.Scanner;
public class Task_2_CarInsurance {
    public static final double ENGINESIZECOEFFICIENT = 0.25;
    public static final double INCREASEDKOEFFICIENT = 1.2;
    public static final double REDUCEDCOEFFICIENT = 0.8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your car's engine size in cubic centimeters: ");
        int engineSize = scanner.nextInt();
        System.out.println("Have there been any car accidents in the last year?");
        boolean carAccidents = scanner.nextBoolean();
        System.out.println("Have you been insured with us earlier?");
        boolean ourInsurance = scanner.nextBoolean();

        double insurancePolicy = engineSize * ENGINESIZECOEFFICIENT;

        if (carAccidents) {
            insurancePolicy = insurancePolicy * INCREASEDKOEFFICIENT;
        } else {
            insurancePolicy = insurancePolicy;
        }

        if (ourInsurance) {
            insurancePolicy = insurancePolicy * REDUCEDCOEFFICIENT;
        } else {
            insurancePolicy = insurancePolicy;
        }
        System.out.println("YOUR INSURANCE POLICY WILL BE " + insurancePolicy + " euro.");
    }
}
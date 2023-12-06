package pl.pingwit.lec_4;

import java.util.Scanner;

public class Task_2_CarInsurance {

    public static final double ENGINE_SIZE_COEFFICIENT = 0.25;
    public static final double INCREASED_COEFFICIENT = 1.2;
    public static final double REDUCED_COEFFICIENT = 0.8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your car's engine size in cubic centimeters: ");
        int engineSize = scanner.nextInt();
        System.out.println("Have there been any car accidents in the last year?");
        boolean carAccidents = scanner.nextBoolean();
        System.out.println("Have you been insured with us earlier?");
        boolean ourInsurance = scanner.nextBoolean();

        double insurancePolicyPrice = engineSize * ENGINE_SIZE_COEFFICIENT;

        if (carAccidents) {
            insurancePolicyPrice = insurancePolicyPrice * INCREASED_COEFFICIENT;
        }
        if (ourInsurance) {
            insurancePolicyPrice = insurancePolicyPrice * REDUCED_COEFFICIENT;
        }
        System.out.println("Your insurance police will be " + insurancePolicyPrice + " EURO.");
    }
}
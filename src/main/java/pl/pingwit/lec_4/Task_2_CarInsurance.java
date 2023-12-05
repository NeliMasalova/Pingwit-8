package pl.pingwit.lec_4;
import java.util.Scanner;
public class Task_2_CarInsurance { // я бы предложил добавить абзац как в прошлой задаче. Можно не добавлять, а убрать в предыдущей. Главное чтобы стиль был одинаковый
    public static final double ENGINESIZECOEFFICIENT = 0.25; // название констант через _
    public static final double INCREASEDKOEFFICIENT = 1.2; // название констант через _
    public static final double REDUCEDCOEFFICIENT = 0.8; // название констант через _

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your car's engine size in cubic centimeters: ");
        int engineSize = scanner.nextInt();
        System.out.println("Have there been any car accidents in the last year?");
        boolean carAccidents = scanner.nextBoolean();
        System.out.println("Have you been insured with us earlier?");
        boolean ourInsurance = scanner.nextBoolean();

        double insurancePolicy = engineSize * ENGINESIZECOEFFICIENT;// insurancePolicy - эта переменная хранит цену, поэтому лучше insurancePolicyPrice,

        if (carAccidents) {
            insurancePolicy = insurancePolicy * INCREASEDKOEFFICIENT;
        } else { // этот else ничего не меняет, давай его просто уберем
            insurancePolicy = insurancePolicy;
        }

        if (ourInsurance) {
            insurancePolicy = insurancePolicy * REDUCEDCOEFFICIENT;
        } else { // этот else ничего не меняет, давай его просто уберем
            insurancePolicy = insurancePolicy;
        }
        System.out.println("YOUR INSURANCE POLICY WILL BE " + insurancePolicy + " euro."); // а почему все предложение большими буквами, кроме валюты? Не угрожай клиентам)
    }
}

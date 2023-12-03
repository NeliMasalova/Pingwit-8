package pl.pingwit.lec_4;

import java.util.Scanner;

public class CurrencyExchangeConverter {

    public static final double EXCHANGERATEUAH = 39.65;
    public static final double EXCHANGERATESEURO = 0.02518;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose the currency. If you want euro - enter 1. If you want uah - enter 2.");
        int currency = scanner.nextInt();
        System.out.println("Please, enter the sum:");
        int sum = scanner.nextInt();


        switch (currency) {
            case 1:
                double euro = EXCHANGERATEUAH;
                double totalSumInUah = euro * sum;
                System.out.println("Amount of money to be issued: " + totalSumInUah + ".");
                break;

            case 2:
                double uah = EXCHANGERATESEURO;
                double totalSumInEuro = uah * sum;
                System.out.println("Amount of money to be issued: " + totalSumInEuro + ".");
                break;

            default:
                String message = null;
                message = "Your currency is not available.";
                System.out.println(message);
        }

    }
}
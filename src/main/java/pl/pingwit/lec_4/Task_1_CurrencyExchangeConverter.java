package pl.pingwit.lec_4;

import java.util.Scanner;

public class Task_1_CurrencyExchangeConverter {

    public static final double EXCHANGE_RATE_UAH = 39.65;
    public static final double EXCHANGE_RATE_EURO = 0.02518;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose the currency. If you want EURO - enter 1. If you want UAH - enter 2.");
        int currency = scanner.nextInt();
        System.out.println("Please, enter the sum:");
        int amount = scanner.nextInt();

        double totalSumInUah = EXCHANGE_RATE_UAH * amount;
        double totalSumInEuro = EXCHANGE_RATE_EURO * amount;
        switch (currency) {
            case 1 -> {
                System.out.println("Amount of money to be issued:" + totalSumInUah + " UAH.");
            }
            case 2 -> {
                System.out.println("Amount of money to be issued: " + totalSumInEuro + " EURO.");
            }
            default -> System.out.println("Your currency is not available.");
        }
    }
}
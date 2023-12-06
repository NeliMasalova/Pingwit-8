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

       switch (currency) { // попробуй заменить на более современный switch
            case 1:
                double totalSumInUah = EXCHANGE_RATE_UAH * amount;
                System.out.println("Amount of money to be issued: " + totalSumInUah + ".");
                break;
            case 2:
                double totalSumInEuro = EXCHANGE_RATE_EURO * amount;
                System.out.println("Amount of money to be issued: " + totalSumInEuro + ".");
                break;
            default:
                System.out.println("Your currency is not available.");
        }
        /* switch (currency) {
            case 1 -> double totalSumInUah = EXCHANGE_RATE_UAH * amount;
            System.out.println("Amount of money to be issued: + totalSumInUah.");
            case 2 -> double totalSumInEuro = EXCHANGE_RATE_EURO * amount;
            System.out.println("Amount of money to be issued: " + totalSumInEuro + ".");
            default -> System.out.println("Your currency is not available.");
        }*/
    }
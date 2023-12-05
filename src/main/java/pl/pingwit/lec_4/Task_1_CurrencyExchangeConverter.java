package pl.pingwit.lec_4;

import java.util.Scanner;

public class Task_1_CurrencyExchangeConverter {

    public static final double EXCHANGERATEUAH = 39.65; // если в константе несколько слов, то через _ -> EXCHANGE_RATE_UAH
    public static final double EXCHANGERATESEURO = 0.02518; // если в константе несколько слов, то через _

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose the currency. If you want euro - enter 1. If you want uah - enter 2."); // названия валют лучше большими буквами всегда
        int currency = scanner.nextInt();
        System.out.println("Please, enter the sum:");
        int sum = scanner.nextInt(); // sum это обычно результат сложения, давай переименуем в amount

        switch (currency) { // попробуй заменить на более современный switch
            case 1:
                double euro = EXCHANGERATEUAH; // эту строку удаляем
                double totalSumInUah = euro * sum; // totalSumInUah = EXCHANGERATEUAH * sum;
                System.out.println("Amount of money to be issued: " + totalSumInUah + ".");
                break;
// эта строка не нужна, удаляем
            case 2:
                double uah = EXCHANGERATESEURO;
                double totalSumInEuro = uah * sum;
                System.out.println("Amount of money to be issued: " + totalSumInEuro + ".");
                break;
// эта строка не нужна, удаляем
            default:
                String message = null; // эту и строку ниже можно объеденить, либо еще проще в System.out.println() вывести сообщение
                message = "Your currency is not available.";
                System.out.println(message);
        }
    }
}

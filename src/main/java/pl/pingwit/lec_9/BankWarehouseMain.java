package pl.pingwit.lec_9;

import java.util.Arrays;

public class BankWarehouseMain {
    public static void main(String[] args) {
        Valuable[] valuablesList = {
                new Valuable("gold"),
                new Valuable("bonds"),
                new Valuable("platinum"),
                new Valuable("jewelry")
        };

        DepositBox[] depositBoxes = {
                new DepositBox(125794, "1L.580_12Myo9", valuablesList),
                new DepositBox(245637, "q1Dew5_fd67", valuablesList),
                new DepositBox(193245, "tg2Rf!d0asd5", valuablesList),
                new DepositBox(354687, "Z5adk!3_cgt5", valuablesList),
                new DepositBox(165793, "H23A_!1drG5x", valuablesList)
        };

        System.out.println(Arrays.toString(depositBoxes[0].extractValuables("1L.580_12Myo9")));

        BankWarehouse warehouse = new BankWarehouse(depositBoxes, "Warehouse");
        depositBoxes[0] = new DepositBox(125794, "777", valuablesList);
        System.out.println(Arrays.toString(warehouse.depositBoxes()));

        System.out.println("====");

        for (int i = 0; i < 10; i++) {
            System.out.println(warehouse.next());
        }
    }
}
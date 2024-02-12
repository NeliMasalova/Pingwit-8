package pl.pingwit.lec_11.task_2_tare;

public class ApplicationTare {
    public static void main(String[] args) {
        Tare[] tares = {
                new Tare("bottle", Material.PLASTIC),
                new Tare("bottle", Material.PLASTIC),
                new Tare("bottle", Material.PLASTIC),
                new Tare("bottle", Material.PLASTIC),
                new Tare("bottle", Material.GLASS),
                new Tare("bottle", Material.GLASS),
                new Tare("bottle", Material.GLASS),
                new Tare("cane", Material.ALUMINIUM),
                new Tare("cane", Material.ALUMINIUM),
        };

        RecyclingMachine recyclingMachine = new RecyclingMachine();
        System.out.println(recyclingMachine.calculateTotalPay(tares));
    }
}
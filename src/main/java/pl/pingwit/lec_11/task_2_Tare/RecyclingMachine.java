package pl.pingwit.lec_11.task_2_Tare;

import java.math.BigDecimal;

public class RecyclingMachine {

    private static final BigDecimal GLASS_TARE_COST = BigDecimal.valueOf(15.0);
    private static final BigDecimal ALUMINIUM_TARE_COST = BigDecimal.valueOf(15.0);
    private static final BigDecimal PLASTIC_TARE_COST = BigDecimal.valueOf(10.0);

    public Receipt calculateTotalPay(Tare[] tares) {
        BigDecimal totalPay = new BigDecimal(0.0);
        BigDecimal tareCost = new BigDecimal(0.0);
        int plasticTare = 0;
        int glassTare = 0;
        int aluminiumTare = 0;
        for (Tare tare : tares) {
            if (Material.PLASTIC == tare.getMaterial()) {
                tareCost = PLASTIC_TARE_COST;
                plasticTare++;
            }
            if (Material.GLASS == tare.getMaterial()) {
                tareCost = GLASS_TARE_COST;
                glassTare++;
            }
            if (Material.ALUMINIUM == tare.getMaterial()) {
                tareCost = ALUMINIUM_TARE_COST;
                aluminiumTare++;
            }
            totalPay = totalPay.add(tareCost);
        }
        String message = "You turned in " + plasticTare + " plastic bottles, " + glassTare + " glass bottles, and  " + aluminiumTare + " aluminum cans. ";
        return new Receipt(message, totalPay);
    }
}
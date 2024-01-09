package pl.pingwit.lec_7.Harvest;

import java.math.BigDecimal;

public class HarvestMain {
    public static void main(String[] args) {
        Harvest[] harvests = {
                new Harvest(120L, "Field 1", "Wheat", BigDecimal.valueOf(120.25)),
                new Harvest(100L, "Field 2", "Wheat", BigDecimal.valueOf(120.25)),
                new Harvest(130L, "Field 1", "Linen", BigDecimal.valueOf(350.00)),
                new Harvest(140L, "Field 2", "Potato", BigDecimal.valueOf(520.86)),
                new Harvest(150L, "Field 2", "Cucumber", BigDecimal.valueOf(200.36)),
                new Harvest(160L, "Field 3", "Onion", BigDecimal.valueOf(332.45))
        };
     HarvestStatisticService harvestStatisticService = new HarvestStatisticService();
     harvestStatisticService.calculateStatistic(harvests);
    }
}
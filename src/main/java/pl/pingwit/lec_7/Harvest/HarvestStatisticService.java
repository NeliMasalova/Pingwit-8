package pl.pingwit.lec_7.Harvest;

import java.math.BigDecimal;

public class HarvestStatisticService {
    public HarvestStatistic[] calculateStatistic(Harvest[] harvests) {
        HarvestStatistic[] harvestStatistics = new HarvestStatistic[harvests.length];
        for (int i = 0; i < harvests.length; i++) {
            Harvest harvest = harvests[i];
            boolean updateResult = update(harvest, harvestStatistics);
            if (!updateResult) {

            }
        }

        return null;
    }

    private boolean update(Harvest harvest, HarvestStatistic[] harvestStatistics) {
        for (int i = 0; i < harvestStatistics.length; i++) {
            HarvestStatistic harvestStatistic = harvestStatistics[i];
            if (harvest.getPlant().equals(harvestStatistic.getPlant())) {
                BigDecimal totalWeight = harvestStatistic.getTotalWeight().add(harvest.getWeight());
                harvestStatistic.setTotalWeight(totalWeight);
                return true;
            }

        }
        return false;
    }
}

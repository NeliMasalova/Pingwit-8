package pl.pingwit.lec_7.task_7_harvest;

import java.math.BigDecimal;

public class HarvestStatisticService {
    public HarvestStatistic[] calculateStatistic(Harvest[] harvests) {
        HarvestStatistic[] harvestStatistics = new HarvestStatistic[harvests.length];
        for (int i = 0; i < harvests.length; i++) {
            Harvest harvest = harvests[i];
            boolean updateResult = update(harvest, harvestStatistics);
            if (!updateResult) {
                for (int j = 0; j < harvestStatistics.length; j++) {
                    if (harvestStatistics[j] == null) {
                        harvestStatistics[j] = new HarvestStatistic(harvest.getPlant(), harvest.getWeight());
                        break;
                    }
                }
            }
        }
        return harvestStatistics;
    }

    private boolean update(Harvest harvest, HarvestStatistic[] harvestStatistics) {
        for (int i = 0; i < harvestStatistics.length; i++) {
            HarvestStatistic harvestStatistic = harvestStatistics[i];
            if (harvestStatistic != null && harvest.getPlant().equals(harvestStatistic.getPlant())) {
                BigDecimal totalWeight = harvestStatistic.getTotalWeight().add(harvest.getWeight());
                harvestStatistic.setTotalWeight(totalWeight);
                return true;
            }
        }
        return false;
    }
}
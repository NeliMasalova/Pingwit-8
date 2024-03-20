package pl.pingwit.lec_22.task_2;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HarvestStatisticService {
    public Map<String, HarvestStatistic> calculateStatistics(List<Harvest> harvests) {
        Map<String, HarvestStatistic> statisticsMap = new TreeMap<>();
        for (Harvest harvest : harvests) {
            String plant = harvest.getPlant();
            BigDecimal weight = harvest.getWeight();
            BigDecimal square = harvest.getSquare();
            if (statisticsMap.containsKey(plant)){
                HarvestStatistic statistic = statisticsMap.get(plant);
                statistic.setTotalWeight(statistic.getTotalWeight().add(weight));
                statistic.setTotalSquare(statistic.getTotalSquare().add(square));
            } else {
                statisticsMap.put(plant, new HarvestStatistic(plant, weight, square));
            }
        }
            return statisticsMap;
    }
}
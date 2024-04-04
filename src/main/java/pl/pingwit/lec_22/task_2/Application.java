package pl.pingwit.lec_22.task_2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Harvest> harvests = objectMapper.readValue(new File("src/main/java/pl/pingwit/lec_22/task_2/harvest.json"), new TypeReference<>() {
        });
        System.out.println(harvests);

        HarvestStatisticService harvestStatisticService = new HarvestStatisticService();

        Map<String, HarvestStatistic> harvestStatisticByPlant = harvestStatisticService.calculateStatistics(harvests);
        System.out.println(harvestStatisticByPlant);

        System.out.println("=====One more version=========");
        Map<String, BigDecimal> harvestStatisticByWeight = harvests.stream()
                .collect(Collectors.toMap(Harvest::getPlant, Harvest::getWeight, BigDecimal::add));
        System.out.println("Statistic by plant weight: " + harvestStatisticByWeight);

        Map<String, BigDecimal> harvestStatisticBySquare = harvests.stream()
                .collect(Collectors.toMap(Harvest::getPlant, Harvest::getSquare, BigDecimal::add));
        System.out.println("Statistic by plant square: " + harvestStatisticBySquare);
    }
}
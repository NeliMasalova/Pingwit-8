package pl.pingwit.lec_22.task_2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

// отформатируй код
public class Application {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List <Harvest> harvests = objectMapper.readValue(new File("src/main/java/pl/pingwit/lec_22/task_2/harvest.json"), new TypeReference<>() {
        });
        System.out.println(harvests);

        HarvestStatisticService harvestStatisticService = new HarvestStatisticService();
        //stringHarvestStatisticMap -> harvestStatisticByPlant, не используй в названии переменных List/Map и т.д.
        Map<String, HarvestStatistic> stringHarvestStatisticMap = harvestStatisticService.calculateStatistics(harvests);
        System.out.println(stringHarvestStatisticMap);
    }
}
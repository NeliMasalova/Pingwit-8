package pl.pingwit.part_26.task_3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChristmasTreeToysMain {
    public static void main(String[] args) {
        List<ChristmasTreeToy> christmasTreeToys = List.of(new ChristmasTreeToy("Snowman", true), // new ChristmasTreeToy лучше с новой строки
                new ChristmasTreeToy("Christmas Tree", false),
                new ChristmasTreeToy("Santa", false),
                new ChristmasTreeToy("Christmas Train", false),
                new ChristmasTreeToy("Traditional Wooden Christmas tree Decoration", true));

        Map<Boolean, List<ChristmasTreeToy>> resultChristmasTreeToysMain = christmasTreeToys.stream()
                .collect(Collectors.partitioningBy(ChristmasTreeToy::isFastener));

        System.out.print(resultChristmasTreeToysMain);
// лишняя строка, удали
    }
}

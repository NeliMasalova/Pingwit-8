package pl.pingwit.part_26.task_2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLowRatingHotel {
    public static void main(String[] args) {
        List<Hotel> hotels = List.of(new Hotel("Phoenix Park Hotel", 8.7),
                new Hotel("ARC HOTEL Washington DC", 8.0),
                new Hotel("State Plaza Hotel", 8.5),
                new Hotel("Marriott Marquis Washington, DC", 8.9),
                new Hotel("Wyndham Garden Washington DC", 6.9),
                new Hotel("Hotel Lombardy", 7.1));

        Optional<Hotel> resultLowRatingHotel = hotels.stream()
                .min(Comparator.comparing(Hotel::hotelRating));
        resultLowRatingHotel.ifPresent(System.out::println);
    }
}
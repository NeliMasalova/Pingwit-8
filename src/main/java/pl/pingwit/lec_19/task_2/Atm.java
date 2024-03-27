package pl.pingwit.lec_19.task_2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Atm( // изменил название, т.к. не запускался код
        long id,
        String area,
        String city,
        String addressType,
        String address,
        String house,
        String workTime,
        String currency,
        boolean cashIn) {
}
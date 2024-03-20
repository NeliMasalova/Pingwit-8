package pl.pingwit.lec_19.task_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Atm[] atms = objectMapper.readValue(new File("src/main/java/pl/pingwit/lec_19/task_2/atm.json"), Atm[].class);
        for (Atm atm:atms) {
            System.out.println(atm);
        }
    }
}
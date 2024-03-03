package pl.pingwit.lec_19.task_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ATM[] atms = objectMapper.readValue(new File("src/main/java/pl/pingwit/lec_19/task_2/atm.json"), ATM[].class);
        System.out.print(Arrays.toString(atms));
    }
}
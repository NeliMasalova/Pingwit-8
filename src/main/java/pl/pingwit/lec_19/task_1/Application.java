package pl.pingwit.lec_19.task_1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R1M", 998, "m");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
           objectMapper.writeValue(new File("src/main/java/pl/pingwit/lec_19/task_1/motorcycle9.xml"), motorcycle);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*Motorcycle motorcycle1 = objectMapper.readValue(new File("src/main/java/pl/pingwit/lec_19/task_1/Motorcycle.xml"), Motorcycle.class);
        System.out.println(motorcycle1);*/
    }
}
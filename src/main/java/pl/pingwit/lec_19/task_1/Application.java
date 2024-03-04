package pl.pingwit.lec_19.task_1;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R1M", 998, "m");
        XmlMapper xmlMapper = new XmlMapper(); // скорее всего здесь тебе нужен был ObjectOutputStream, тогда поле точно не будет сериализоваться. XmlMapper возможно не обращает внимания на то что полк transient

        try {
            xmlMapper.writeValue(new File("src/main/java/pl/pingwit/lec_19/task_1/motorcycle7.xml"), motorcycle);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        AnotherMotorcycle motorcycle1 = xmlMapper.readValue(new File("src/main/java/pl/pingwit/lec_19/task_1/Motorcycle.xml"), AnotherMotorcycle.class);
        System.out.println(motorcycle1);
    }
}

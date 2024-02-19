package pl.pingwit.lec_18.task_4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) {
        String inputPath = "src/main/java/pl/pingwit/lec_18/task_4/favourite_song";
        String outPath = "src/main/java/pl/pingwit/lec_18/task_4/favourite_song-copy2";

        try (FileReader fileReader = new FileReader(inputPath);
             FileWriter fileWriter = new FileWriter(outPath)) {
            int c;
            while ((c = fileReader.read()) != -1) {
                fileWriter.write(c);
                System.out.print((char) c);
            }
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
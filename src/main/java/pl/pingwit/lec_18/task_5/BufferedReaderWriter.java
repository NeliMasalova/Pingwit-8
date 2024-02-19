package pl.pingwit.lec_18.task_5;

import java.io.*;

public class BufferedReaderWriter {
    public static void main(String[] args) {
        String inputPath = "src/main/java/pl/pingwit/lec_18/task_5/lyrics";
        String outputPath = "src/main/java/pl/pingwit/lec_18/task_5/lyrics-copy";

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputPath));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputPath))) {
            int c;
            while ((c = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(c);
                System.out.print((char) c);
            }
            bufferedOutputStream.flush();
        } catch (IOException exception) {
            throw new RuntimeException();
        }
    }
}
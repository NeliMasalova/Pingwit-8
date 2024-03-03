package pl.pingwit.lec_18.task_5;

import java.io.*;

public class BufferedReaderWriter {
    public static void main(String[] args) {
        String inputPath = "src/main/java/pl/pingwit/lec_18/task_5/lyrics.txt";
        String outputPath = "src/main/java/pl/pingwit/lec_18/task_5/lyrics-copy.txt";

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputPath));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputPath))) {
            int data;
            byte[] bytes = new byte[1024];
            while ((data = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, data);
                for (int i = 0; i < data; i++) {
                    System.out.print((char) bytes[i]);
                }
            }
            bufferedOutputStream.flush();
        } catch (IOException exception) {
            throw new RuntimeException();
        }
    }
}
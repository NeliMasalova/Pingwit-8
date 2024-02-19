package pl.pingwit.lec_18.task_2;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String inputPath = "src/main/java/pl/pingwit/lec_18/task_2/img.png";
        String outputPath = "src/main/java/pl/pingwit/lec_18/task_2/img.png-copy2";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {
            byte[] bytes = new byte[1024];
            while ((inputStream.read(bytes)) != -1) {
                for (Byte aByte : bytes) {
                    outputStream.write(aByte);
                }
            }
            outputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
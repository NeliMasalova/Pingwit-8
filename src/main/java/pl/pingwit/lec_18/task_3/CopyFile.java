package pl.pingwit.lec_18.task_3;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String inputPath = "src/main/java/pl/pingwit/lec_18/task_3/img.png";
        String outputPath = "src/main/java/pl/pingwit/lec_18/task_3/img.png-copy";

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputPath));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputPath))) {
            byte[] bytes = new byte[1024];
            while ((bufferedInputStream.read(bytes)) != -1) {
                for (byte aByte : bytes) {
                    bufferedOutputStream.write(aByte);
                }
            }
            bufferedOutputStream.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
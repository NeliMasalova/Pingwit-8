package pl.pingwit.lec_18.task_1_package_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String path = "src/main/java/pl/pingwit/lec_18/task_1_package_1";
        File file = new File(path);
        System.out.println(file.isDirectory());

        String path2 = "src/main/java/pl/pingwit/lec_18/task_1_package_1/package_2";
        File file2 = new File(path2);
        System.out.println(file2.isDirectory());

        String path3 = "src/main/java/pl/pingwit/lec_18/task_1_package_1/package_2/example.txt";
        File file3 = new File(path3);

        try {
            Scanner scanner = new Scanner(file3);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            throw new RuntimeException("File not found");
        }
    }
}
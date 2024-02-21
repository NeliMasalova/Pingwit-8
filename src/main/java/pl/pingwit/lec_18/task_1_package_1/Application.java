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

        /*
        Давай попробуем усложнить эту часть, чтобы красиво было. Будем печатать на экран все файлы .txt, т.е.
        можно у file2 вызвать метод listFiles() и через проверку из isFile() + isTxtFile() - это твой кастомный метод и затем класс сканнер.
        У класса строк есть метод lastIndexOf("."), при помощи которого ты сможешь получить расширение файла -> в метод subString передать полученный индекс
        */
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

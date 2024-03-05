package pl.pingwit.additional_task;

import java.io.File;

//Написать функцию, которая бы обходила весь каталог (включая вложенные папки и файлы) и печатала бы на экран структуру.
public class DirectoryStructure {
    public static void main(String[] args) {
        String path = "src/main/java/pl/pingwit";
        File file = new File(path);
        printDirectoryStructure(file);
    }

    public static void printDirectoryStructure(File file) {
        File[] files = file.listFiles();
        for (File a : files) {
            if (a.isDirectory()) {
                System.out.println(a.getName());
                printDirectoryStructure(a);
            } else {
                System.out.println("      " + a.getName()); // \t вместо пробелов в ковычках
            }
        }
    }
}

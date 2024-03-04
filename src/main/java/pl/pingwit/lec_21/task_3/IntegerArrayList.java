package pl.pingwit.lec_21.task_3;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        int size = 100;
        for (int i = 1; i < size + 1; i++) {
            integers.add(0, i);
        }
        System.out.println(integers); // сюда бы абзац добавить
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < size; i++) { // вместо цикла for тебе нужна конструкция while(iterator.hasNext)
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(integers);
    }
}

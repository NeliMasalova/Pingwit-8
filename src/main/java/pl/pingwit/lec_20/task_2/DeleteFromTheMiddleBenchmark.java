package pl.pingwit.lec_20.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Task 2
//        Есть ArrayList и LinkedList на 100К одинаковых элементов.
//        Нужно написать бенчмарк, который бы показал скорость удаления из СЕРЕДИНЫ у двух этих листов
//        Удалить нужно все элементы
public class DeleteFromTheMiddleBenchmark {
    public static void main(String[] args) {
        int size = 100000;

        ArrayList<Integer> integers = new ArrayList<>(); // integers -> arrayList - т.к. у тебя бенчмарк сравнения arrayList и linkedList, то такое название ок
        for (int i = 0; i < size; i++) {
            integers.add(i);
        }
        long startTime = System.currentTimeMillis();
        deleteFromMiddle(integers, size);
        long endTime = System.currentTimeMillis();
        System.out.println("Element removal execution time for Array List is: " + (endTime - startTime) + " milliseconds");

        LinkedList<Integer> integerLinkedList = new LinkedList<>(); // integerLinkedList -> linkedList содержимое можно по дженерике определить
        for (int i = 0; i < size; i++) {
            integerLinkedList.add(i);
        }
        long startTime1 = System.currentTimeMillis(); // опять странное название переменной, нельзя так. startTime1 можно вообще удалить переменную и заново присвоить значение 'startTime', которую ты создавала выше
        deleteFromMiddle(integerLinkedList, size);
        long endTime1 = System.currentTimeMillis(); // аналогично startTime1
        System.out.println("Element removal execution time for Linked List is: " + (endTime1 - startTime1) + " milliseconds.");
    }

    private static void deleteFromMiddle(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) { // опасный код пишешь, лучше используй list.size()
            list.remove(list.size() / 2);
        }
    }
}

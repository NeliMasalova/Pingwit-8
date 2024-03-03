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

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            integers.add(i);
        }
        long startTime = System.currentTimeMillis();
        deleteFromMiddle(integers, size);
        long endTime = System.currentTimeMillis();
        System.out.println("Element removal execution time for Array List is: " + (endTime - startTime) + " milliseconds");

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            integerLinkedList.add(i);
        }
        long startTime1 = System.currentTimeMillis();
        deleteFromMiddle(integerLinkedList, size);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Element removal execution time for Linked List is: " + (endTime1 - startTime1) + " milliseconds.");
    }

    private static void deleteFromMiddle(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.remove(list.size() / 2);
        }
    }
}
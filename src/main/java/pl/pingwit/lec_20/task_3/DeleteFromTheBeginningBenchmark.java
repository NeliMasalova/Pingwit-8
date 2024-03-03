package pl.pingwit.lec_20.task_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DeleteFromTheBeginningBenchmark {
    public static void main(String[] args) {
        int size = 100000;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            integers.add(i);
        }

        long startTime = System.currentTimeMillis();
        deleteFromBeginning(integers, size);
        long finishTime = System.currentTimeMillis();
        System.out.println("Element removal execution time for Array List is: " + (finishTime - startTime) + " milliseconds.");

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            integerLinkedList.add(i);
        }
        long startTime1 = System.currentTimeMillis();
        deleteFromBeginning(integerLinkedList, size);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Element removal execution time for Linked List is: " + (endTime1 - startTime1) + " milliseconds.");
    }

    private static void deleteFromBeginning(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.remove(0);
        }
    }
}

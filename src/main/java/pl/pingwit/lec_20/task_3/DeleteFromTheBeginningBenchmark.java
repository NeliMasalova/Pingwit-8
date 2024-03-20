package pl.pingwit.lec_20.task_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DeleteFromTheBeginningBenchmark {
    public static void main(String[] args) {
        int size = 100000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        long startArrayList = System.currentTimeMillis();
        deleteFromBeginning(arrayList, size);
        long finishArrayList = System.currentTimeMillis();
        System.out.println("Element removal execution time for Array List is: " + (finishArrayList - startArrayList) + " milliseconds.");

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        long startLinkedList = System.currentTimeMillis();
        deleteFromBeginning(linkedList, size);
        long finishLinkedList = System.currentTimeMillis();
        System.out.println("Element removal execution time for Linked List is: " + (finishLinkedList - startLinkedList) + " milliseconds.");
    }

    private static void deleteFromBeginning(List<Integer> list, int size) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(0);
        }
    }
}
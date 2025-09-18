package org.structures.queue.service.impl;

import org.structures.queue.service.QueueService;
import java.util.ArrayList;
import java.util.List;
import org.structures.queue.model.PrintJob;

public class QueueServiceImpl implements QueueService {

    private final List<PrintJob> queue;

    public QueueServiceImpl() {
        this.queue = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void enqueue(PrintJob data) {
        queue.add(data); // Adding to the end is efficient
        System.out.println("------------------------------------");
        System.out.println("[QUEUE] '" + data.getDocumentName() + "' was added to the queue.");
        System.out.println("------------------------------------");
    }

    @Override
    public PrintJob dequeue() {
        if (isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("[QUEUE] The queue is empty. Cannot dequeue.");
            System.out.println("------------------------------------");
            return null;
        }
        PrintJob data = queue.removeFirst();
        System.out.println("------------------------------------");
        System.out.println("[QUEUE] '" + data.getDocumentName() + "' was removed from the queue.");
        System.out.println("------------------------------------");
        return data;
    }

    @Override
    public PrintJob peek() {
        if (isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("[QUEUE] The queue is empty. Cannot peek.");
            System.out.println("------------------------------------");
            return null;
        }
        return queue.getFirst();
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("[QUEUE] The queue is empty.");
            System.out.println("------------------------------------");
            return;
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Elements in Queue (Front to Back)");
        for (int i = 0; i < queue.size(); i++) {
            System.out.println((i + 1) + ". " + queue.get(i));
        }
        System.out.println("-----------------------------------------");
    }
}
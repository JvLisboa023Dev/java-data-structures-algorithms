package org.structures.queue.service;

import org.structures.queue.model.PrintJob;

public interface QueueService {
    void enqueue(PrintJob job);
    PrintJob dequeue();
    PrintJob peek();
    boolean isEmpty();
    void display();
}
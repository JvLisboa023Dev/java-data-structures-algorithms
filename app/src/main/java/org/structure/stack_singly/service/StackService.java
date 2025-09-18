package org.structure.stack_singly.service;

public interface StackService {
    boolean isEmpty();

    void push(String data);

    String pop();

    String peek();

    void display();
}

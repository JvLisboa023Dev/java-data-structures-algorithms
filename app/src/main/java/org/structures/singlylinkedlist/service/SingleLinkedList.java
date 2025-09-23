package org.structures.singly_linked_list.service;

public interface SingleLinkedList {
    boolean isEmpty();

    void push(String data);

    String pop();

    String peek();

    void display();
}

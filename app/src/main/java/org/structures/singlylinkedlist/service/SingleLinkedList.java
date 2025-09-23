package org.structures.singlylinkedlist.service;

public interface SingleLinkedList {
    boolean isEmpty();

    void push(String data);

    String pop();

    String peek();

    void display();
}

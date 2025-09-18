package org.structures.singly_linked_list.service.impl;

import org.structures.singly_linked_list.model.SinglyNode;
import org.structures.singly_linked_list.service.SingleLinkedList;

public class SinglyLinkedSingleLinkedList implements SingleLinkedList {
    private SinglyNode top;

    public SinglyLinkedSingleLinkedList() {
        this.top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(String data) {
        this.top = new SinglyNode(data, this.top);
        System.out.println("------------------------------------");
        System.out.println("[STACK] '" + data + "' was added to the stack.");
        System.out.println("------------------------------------");
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("[STACK] The stack is empty. Cannot pop.");
            System.out.println("------------------------------------");
            return null;
        }
        String data = top.getData();
        top = top.getNext();
        System.out.println("------------------------------------");
        System.out.println("[STACK] '" + data + "' was removed from the stack.");
        System.out.println("------------------------------------");
        return data; // Correctly returns the popped value
    }

    @Override
    public String peek() {
        if (isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("[STACK] The stack is empty. Cannot peek.");
            System.out.println("------------------------------------");
            return null;
        }
        return top.getData();
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("[STACK] The stack is empty.");
            System.out.println("------------------------------------");
            return;
        }
        System.out.println("------------------------------------");
        System.out.println("Elements in Stack (Top to Bottom)");
        SinglyNode current = top;
        while (current != null) {
            System.out.println("- " + current.getData());
            current = current.getNext();
        }
        System.out.println("-----------------------------------------");
    }
}
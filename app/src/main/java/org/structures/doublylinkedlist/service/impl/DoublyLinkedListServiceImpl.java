package org.structures.doublylinkedlist.service.impl;

import org.structures.doublylinkedlist.model.Node;
import org.structures.doublylinkedlist.service.DoublyLinkedListService;

public class DoublyLinkedListServiceImpl implements DoublyLinkedListService {

    private Node currentNode;

    public DoublyLinkedListServiceImpl(String initialData) {
        this.currentNode = new Node(initialData, null, null);
    }

    @Override
    public void addAfterCurrent(String data) {
        Node newNode = new Node(data, null, this.currentNode);
        this.currentNode.setNext(newNode);
        this.currentNode = newNode;
    }

    @Override
    public String moveToPrevious() {
        if (currentNode.getPrevious() != null) {
            currentNode = currentNode.getPrevious();
            return currentNode.getData();
        }
        System.out.println("-----------------------------------");
        System.out.println("Already at the head of the list.");
        System.out.println("-----------------------------------");
        return currentNode.getData();
    }

    @Override
    public String moveToNext() {
        if (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            return currentNode.getData();
        }
        System.out.println("-----------------------------------");
        System.out.println("Already at the tail of the list.");
        System.out.println("-----------------------------------");
        return currentNode.getData();
    }

    @Override
    public String getCurrentData() {
        return this.currentNode.getData();
    }

    @Override
    public void display() {
        System.out.println("------------------------------------");
        System.out.println("Doubly Linked List State");
        Node temp = this.currentNode;
        while (temp.getPrevious() != null) {
            temp = temp.getPrevious();
        }

        while (temp != null) {
            String marker = temp == this.currentNode ? " <--- [CURRENT]" : "";
            System.out.println("- " + temp.getData() + marker);
            temp = temp.getNext();
        }
        System.out.println("------------------------------");
    }
}
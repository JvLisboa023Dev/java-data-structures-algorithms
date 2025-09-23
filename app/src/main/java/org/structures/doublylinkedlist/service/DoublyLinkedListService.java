
package org.structures.doublylinkedlist.service;

public interface DoublyLinkedListService {
    void addAfterCurrent(String data);
    String moveToPrevious();
    String moveToNext();
    String getCurrentData();
    void display();
}
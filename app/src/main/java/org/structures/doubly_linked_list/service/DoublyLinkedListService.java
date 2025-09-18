
package org.structures.doubly_linked_list.service;

public interface DoublyLinkedListService {
    void addAfterCurrent(String data);
    String moveToPrevious();
    String moveToNext();
    String getCurrentData();
    void display();
}
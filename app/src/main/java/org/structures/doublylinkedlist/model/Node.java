package org.structures.doublylinkedlist.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Node {
    private String data;
    private Node next;
    private Node previous;
}
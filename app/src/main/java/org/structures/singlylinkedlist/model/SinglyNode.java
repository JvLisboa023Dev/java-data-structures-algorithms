// Local: app/src/main/java/org/structure/stack_singly/model/SinglyNode.java
package org.structures.singly_linked_list.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SinglyNode {
    private String data;
    private SinglyNode next;
}
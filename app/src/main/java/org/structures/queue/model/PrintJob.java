package org.structures.queue.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrintJob {
    private String documentName;

    @Override
    public String toString() {
        return this.documentName;
    }
}
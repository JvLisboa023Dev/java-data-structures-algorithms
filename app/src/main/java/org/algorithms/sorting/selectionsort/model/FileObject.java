package org.algorithms.sorting.selectionsort.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileObject implements Comparable<FileObject> {
    private String fileName;
    private int sizeInKb; // Size in Kilobytes

    @Override
    public int compareTo(FileObject other) {
        return Integer.compare(this.sizeInKb, other.sizeInKb);
    }
}
package org.algorithms.searching.binarysearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Comparable<Book> {
    private int catalogId; // A unique, sorted ID
    private String title;
    private String author;

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.catalogId, other.catalogId);
    }
}
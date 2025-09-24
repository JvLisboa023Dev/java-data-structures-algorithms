package org.algorithms.searching.binarysearch.algorithm;

import org.algorithms.searching.binarysearch.model.Book;
import java.util.List;

public class BinarySearch {
    public static Book findById(List<Book> sortedBooks, int targetId) {
        int low = 0;
        int high = sortedBooks.size() - 1;
        int steps = 0;

        while (low <= high) {
            steps++;
            int mid = low + (high - low) / 2; // Avoids overflow for very large lists
            Book midBook = sortedBooks.get(mid);
            System.out.println("Step " + steps + ": Checking middle element at index " + mid + " (ID: " + midBook.getCatalogId() + ")");

            if (midBook.getCatalogId() == targetId) {
                System.out.println("Found target in " + steps + " steps.");
                return midBook;
            }

            if (midBook.getCatalogId() < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Target not found after " + steps + " steps.");
        return null;
    }
}

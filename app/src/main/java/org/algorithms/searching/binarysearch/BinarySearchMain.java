package org.algorithms.searching.binarysearch;

import org.algorithms.searching.binarysearch.algorithm.BinarySearch;
import org.algorithms.searching.binarysearch.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class BinarySearchMain {
    public static void main(String[] args) {
        List<Book> catalog = new ArrayList<>();
        catalog.add(new Book(1011, "The Hobbit", "J.R.R. Tolkien"));
        catalog.add(new Book(2035, "1984", "George Orwell"));
        catalog.add(new Book(1056, "The Catcher in the Rye", "J.D. Salinger"));
        catalog.add(new Book(3012, "Brave New World", "Aldous Huxley"));
        catalog.add(new Book(2010, "To Kill a Mockingbird", "Harper Lee"));
        catalog.add(new Book(4001, "Dune", "Frank Herbert"));

        Collections.sort(catalog);

        System.out.println("--- Library Catalog (Sorted by ID) ---");
        catalog.forEach(book -> System.out.println("ID: " + book.getCatalogId() + ", Title: " + book.getTitle()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Book Search (Binary Search) ---");
        System.out.print("Enter the Catalog ID of the book to find: ");
        int idToFind = scanner.nextInt();

        System.out.println("\nStarting binary search for ID: " + idToFind);
        Book foundBook = BinarySearch.findById(catalog, idToFind);

        System.out.println("\n--- Search Result ---");
        if (foundBook != null) {
            System.out.println("Book Found!");
            System.out.println("  ID: " + foundBook.getCatalogId());
            System.out.println("  Title: " + foundBook.getTitle());
            System.out.println("  Author: " + foundBook.getAuthor());
        } else {
            System.out.println("Book with ID '" + idToFind + "' was not found in the catalog.");
        }

        scanner.close();
    }
}

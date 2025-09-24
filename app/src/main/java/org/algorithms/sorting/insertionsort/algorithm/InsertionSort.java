package org.algorithms.sorting.insertionsort.algorithm;

import org.algorithms.sorting.insertionsort.model.Card;
import java.util.List;

public class InsertionSort {

    public static void sort(List<Card> hand) {
        int n = hand.size();
        System.out.println("--- Starting Insertion Sort ---");

        // Start from the second element because the first element is considered the initial sorted portion
        for (int i = 1; i < n; ++i) {
            Card key = hand.get(i); // The card to be inserted
            int j = i - 1;
            System.out.println("\nPass " + i + ": Taking card '" + key + "' to insert into the sorted portion.");

            while (j >= 0 && hand.get(j).compareTo(key) > 0) {
                System.out.println("  Shifting '" + hand.get(j) + "' to the right.");
                hand.set(j + 1, hand.get(j));
                j = j - 1;
            }

            hand.set(j + 1, key);
            System.out.println("  Inserted '" + key + "' at position " + (j + 1));
        }
        System.out.println("\n--- Insertion Sort Finished ---");
    }
}

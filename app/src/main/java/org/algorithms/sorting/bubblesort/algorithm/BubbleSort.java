package org.algorithms.sorting.bubblesort.algorithm;

import org.algorithms.sorting.bubblesort.model.PlayerScore;

import java.util.List;

public class BubbleSort {

    public static void sort (List<PlayerScore> scores) {

        int n = scores.size();
        boolean swapped = false;

        System.out.println("--- Starting Bubble Sort ---");

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("\nPass " + (i + 1) + ":");

            for (int j = 0; j < n - i - 1; j++) {
                PlayerScore current = scores.get(j);
                PlayerScore next = scores.get(j + 1);

                if (current.compareTo(next) > 0) {
                    System.out.println("  Swapping -> " + current.getPlayerName() + " (" + current.getScore() + ") <-> " + next.getPlayerName() + " (" + next.getScore() + ")");
                    scores.set(j, next);
                    scores.set(j + 1, current);
                    swapped = true;
                }
            }
            if (!swapped) {
                System.out.println("No swaps in this pass. List is sorted.");
                break;
            }
        }
        System.out.println("\n--- Bubble Sort Finished ---");
    }
}

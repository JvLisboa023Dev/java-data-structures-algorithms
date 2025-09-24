package org.algorithms.sorting.quicksort.algorithm;

import org.algorithms.sorting.quicksort.model.AuctionItem;

import java.util.Collections;
import java.util.List;

public class QuickSort {
    public static void sort(List<AuctionItem> items) {
        System.out.println("--- Starting Quick Sort ---");
        quickSort(items, 0, items.size() - 1);
        System.out.println("--- Quick Sort Finished ---");
    }

    private static void quickSort(List<AuctionItem> items, int low, int high) {
        if (low < high) {
            int pi = partition(items, low, high);

            quickSort(items, low, pi - 1);
            quickSort(items, pi + 1, high);
        }
    }

    private static int partition(List<AuctionItem> items, int low, int high) {
        AuctionItem pivot = items.get(high); // Choosing the last element as the pivot
        int i = (low - 1);
        System.out.println("\nPartitioning from index " + low + " to " + high + ". Pivot: " + pivot.getItemName() + " (" + pivot.getNumberOfBids() + " bids)");

        for (int j = low; j < high; j++) {
            // In our case, "smaller" means "more bids" because of our compareTo method
            if (items.get(j).compareTo(pivot) <= 0) {
                i++;

                System.out.println("  Swapping " + items.get(i).getItemName() + " <-> " + items.get(j).getItemName());
                Collections.swap(items, i, j);
            }
        }

        System.out.println("  Placing pivot. Swapping " + items.get(i + 1).getItemName() + " <-> " + items.get(high).getItemName());
        Collections.swap(items, i + 1, high);

        return i + 1;
    }
}

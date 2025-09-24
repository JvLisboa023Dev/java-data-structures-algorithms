package org.algorithms.sorting.quicksort;

import org.algorithms.sorting.quicksort.algorithm.QuickSort;
import org.algorithms.sorting.quicksort.model.AuctionItem;
import java.util.ArrayList;
import java.util.List;

public class QuickSortMain {

    public static void main(String[] args) {
        List<AuctionItem> items = new ArrayList<>();
        items.add(new AuctionItem("Vintage Vase", 32));
        items.add(new AuctionItem("Antique Clock", 15));
        items.add(new AuctionItem("Gaming Console", 58));
        items.add(new AuctionItem("Rare Coin", 75));
        items.add(new AuctionItem("Designer Handbag", 41));
        items.add(new AuctionItem("First Edition Book", 22));

        System.out.println("--- Unsorted Auction Items ---");
        items.forEach(item -> System.out.println(item.getItemName() + " - " + item.getNumberOfBids() + " bids"));
        System.out.println();

        QuickSort.sort(items);

        System.out.println("\n--- Final Sorted Items (by popularity) ---");
        items.forEach(item -> System.out.println(item.getItemName() + " - " + item.getNumberOfBids() + " bids"));
    }
}

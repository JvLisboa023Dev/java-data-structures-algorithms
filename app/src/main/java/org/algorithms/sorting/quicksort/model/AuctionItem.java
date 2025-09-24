package org.algorithms.sorting.quicksort.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AuctionItem implements Comparable<AuctionItem> {
    private String itemName;
    private int numberOfBids;

    @Override
    public int compareTo(AuctionItem other) {
        return Integer.compare(other.numberOfBids, this.numberOfBids);
    }
}

package org.algorithms.sorting.insertionsort.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card implements Comparable<Card> {
    private int rank; // 2-10 for numbers, 11=Jack, 12=Queen, 13=King, 14=Ace
    private String suit; // "Hearts", "Spades" and etc...

    @Override
    public String toString() {
        String rankStr = switch (rank) {
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            case 14 -> "Ace";
            default -> String.valueOf(rank);
        };
        return rankStr + " of " + suit;
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.rank, other.rank);
    }
}
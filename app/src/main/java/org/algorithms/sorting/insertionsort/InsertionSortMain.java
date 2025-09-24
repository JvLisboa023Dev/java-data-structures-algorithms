package org.algorithms.sorting.insertionsort;

import org.algorithms.sorting.insertionsort.algorithm.InsertionSort;
import org.algorithms.sorting.insertionsort.model.Card;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortMain {

    public static void main(String[] args) {

        // Simulating a hand of cards, received in a random order
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(12, "Hearts"));   // Queen
        hand.add(new Card(5, "Diamonds"));  // 5
        hand.add(new Card(14, "Spades"));   // Ace
        hand.add(new Card(8, "Clubs"));     // 8
        hand.add(new Card(11, "Hearts"));   // Jack

        System.out.println("--- Unsorted Hand of Cards ---");
        hand.forEach(System.out::println);
        System.out.println();

        InsertionSort.sort(hand);

        System.out.println("\n--- Final Sorted Hand ---");
        hand.forEach(System.out::println);
    }
}

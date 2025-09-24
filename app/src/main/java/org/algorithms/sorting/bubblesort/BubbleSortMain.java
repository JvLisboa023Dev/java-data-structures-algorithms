package org.algorithms.sorting.bubblesort;

import org.algorithms.sorting.bubblesort.algorithm.BubbleSort;
import org.algorithms.sorting.bubblesort.model.PlayerScore;
import java.util.ArrayList;
import java.util.List;

public class BubbleSortMain {
    public static void main(String[] args) {
        List<PlayerScore> scores = new ArrayList<>();
        scores.add(new PlayerScore("Alice", 850));
        scores.add(new PlayerScore("Bob", 1200));
        scores.add(new PlayerScore("Charlie", 950));
        scores.add(new PlayerScore("David", 1500));
        scores.add(new PlayerScore("Eve", 700));

        System.out.println("--- Unsorted Leaderboard ---");
        scores.forEach(score -> System.out.println(score.getPlayerName() + ": " + score.getScore()));
        System.out.println();

        BubbleSort.sort(scores);

        System.out.println("\n--- Final Sorted Leaderboard ---");
        scores.forEach(score -> System.out.println(score.getPlayerName() + ": " + score.getScore()));
    }
}

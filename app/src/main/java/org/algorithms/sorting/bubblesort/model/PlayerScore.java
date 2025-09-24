package org.algorithms.sorting.bubblesort.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerScore implements Comparable<PlayerScore> {
    private String playerName;
    private int score;

    @Override
    public int compareTo(PlayerScore other) {
        return Integer.compare(other.score, this.score);
    }
}
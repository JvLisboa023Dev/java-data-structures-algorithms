package org.algorithms.sorting.mergesort.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Comparable<Order> {
    private int orderId;
    private LocalDateTime timestamp;

    @Override
    public int compareTo(Order other) {
        return this.timestamp.compareTo(other.timestamp);
    }
}
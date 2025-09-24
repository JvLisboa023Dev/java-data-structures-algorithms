package org.algorithms.sorting.mergesort;

import org.algorithms.sorting.mergesort.algorithm.MergeSort;
import org.algorithms.sorting.mergesort.model.Order;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MergeSortMain {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(105, LocalDateTime.now().minusHours(2)));
        orders.add(new Order(101, LocalDateTime.now().minusHours(5)));
        orders.add(new Order(108, LocalDateTime.now().minusMinutes(30)));
        orders.add(new Order(103, LocalDateTime.now().minusHours(3)));
        orders.add(new Order(102, LocalDateTime.now().minusHours(4)));
        orders.add(new Order(107, LocalDateTime.now().minusHours(1)));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("--- Unsorted E-commerce Orders ---");
        orders.forEach(order -> System.out.println("ID: " + order.getOrderId() + ", Time: " + order.getTimestamp().format(formatter)));
        System.out.println();

        MergeSort.sort(orders);

        System.out.println("\n--- Final Sorted Order List (for processing) ---");
        orders.forEach(order -> System.out.println("ID: " + order.getOrderId() + ", Time: " + order.getTimestamp().format(formatter)));
    }
}

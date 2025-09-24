package org.algorithms.sorting.mergesort.algorithm;

import org.algorithms.sorting.mergesort.model.Order;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void sort(List<Order> orders) {
        System.out.println("--- Starting Merge Sort ---");
        mergeSort(orders, 0, orders.size() - 1);
        System.out.println("--- Merge Sort Finished ---");
    }

    private static void mergeSort(List<Order> orders, int left, int right) {
        //if the sublist has 1 or 0 elements, it's already sorted.
        if (left < right) {
            // Find the middle point to divide the list into two halves
            int middle = left + (right - left) / 2;

            System.out.println("Dividing: left=" + left + ", middle=" + middle + ", right=" + right);

            mergeSort(orders, left, middle);
            mergeSort(orders, middle + 1, right);

            merge(orders, left, middle, right);
        }
    }


    private static void merge(List<Order> orders, int left, int middle, int right) {
        System.out.println("Merging: left=" + left + ", middle=" + middle + ", right=" + right);
        List<Order> leftHalf = new ArrayList<>(orders.subList(left, middle + 1));
        List<Order> rightHalf = new ArrayList<>(orders.subList(middle + 1, right + 1));

        int i = 0, j = 0;
        int k = left;

        // Merge the temp lists back into the original list
        while (i < leftHalf.size() && j < rightHalf.size()) {
            if (leftHalf.get(i).compareTo(rightHalf.get(j)) <= 0) {
                orders.set(k, leftHalf.get(i));
                i++;
            } else {
                orders.set(k, rightHalf.get(j));
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftHalf, if any
        while (i < leftHalf.size()) {
            orders.set(k, leftHalf.get(i));
            i++;
            k++;
        }

        // Copy remaining elements of rightHalf, if any
        while (j < rightHalf.size()) {
            orders.set(k, rightHalf.get(j));
            j++;
            k++;
        }
    }
}

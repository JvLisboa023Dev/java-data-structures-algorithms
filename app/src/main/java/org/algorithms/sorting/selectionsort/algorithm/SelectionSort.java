package org.algorithms.sorting.selectionsort.algorithm;

import org.algorithms.sorting.selectionsort.model.FileObject;

import java.util.List;

public class SelectionSort {

    public static void sort (List<FileObject> files) {
        int n = files.size();
        System.out.println("--- Starting Selection Sort ---");

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            System.out.println("\nPass " + (i + 1) + ": (Sorted part ends at index " + (i - 1) + ")");
            System.out.println("  Finding minimum in the unsorted part (from index " + i + " to " + (n - 1) + ")");

            for (int j = i + 1; j < n; j++) {
                if (files.get(j).compareTo(files.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            FileObject minFile = files.get(minIndex);
            System.out.println("  Minimum found: " + minFile.getFileName() + " (" + minFile.getSizeInKb() + " KB) at index " + minIndex);

            if (minIndex != i) {
                System.out.println("  Swapping with element at index " + i + ": " + files.get(i).getFileName());
                FileObject temp = files.get(i);
                files.set(i, files.get(minIndex));
                files.set(minIndex, temp);
            } else {
                System.out.println("  Element is already in its correct position. No swap needed.");
            }
        }
        System.out.println("\n--- Selection Sort Finished ---");
    }
}

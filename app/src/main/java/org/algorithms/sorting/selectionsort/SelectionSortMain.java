package org.algorithms.sorting.selectionsort;

import java.util.ArrayList;
import java.util.List;
import org.algorithms.sorting.selectionsort.algorithm.SelectionSort;
import org.algorithms.sorting.selectionsort.model.FileObject;

public class SelectionSortMain {

    public static void main(String[] args) {
        List<FileObject> files = new ArrayList<>();
        files.add(new FileObject("document.pdf", 5120));
        files.add(new FileObject("image.jpg", 1024));
        files.add(new FileObject("archive.zip", 12800));
        files.add(new FileObject("notes.txt", 15));
        files.add(new FileObject("presentation.pptx", 8400));

        System.out.println("--- Unsorted File List ---");
        files.forEach(file -> System.out.println(file.getFileName() + " - " + file.getSizeInKb() + " KB"));
        System.out.println();

        SelectionSort.sort(files);

        System.out.println("\n--- Final Sorted File List (by size) ---");
        files.forEach(file -> System.out.println(file.getFileName() + " - " + file.getSizeInKb() + " KB"));
    }
}

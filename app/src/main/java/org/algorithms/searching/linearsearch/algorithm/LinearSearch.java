package org.algorithms.searching.linearsearch.algorithm;

import org.algorithms.searching.linearsearch.model.Product;

import java.util.List;

public class LinearSearch {

    public static Product findBySku(List<Product> products, String targetSku) {
        for (Product product : products) {
            System.out.println("Checking SKU: " + product.getSku() + "...");
            if (product.getSku().equalsIgnoreCase(targetSku)) {
                return product;
            }
        }
        return null;
    }
}
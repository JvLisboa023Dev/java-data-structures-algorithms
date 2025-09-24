package org.algorithms.searching.linearsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String sku; // Stock Keeping Unit
    private String name;
    private int quantityInStock;
}
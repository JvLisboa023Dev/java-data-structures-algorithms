package org.algorithms.searching.linearsearch;

import org.algorithms.searching.linearsearch.algorithm.LinearSearch;
import org.algorithms.searching.linearsearch.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearchMain {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("MSE-002", "Wireless Mouse", 150));
        productList.add(new Product("KEY-003", "Mechanical Keyboard", 80));
        productList.add(new Product("MON-001", "4K Monitor", 35));
        productList.add(new Product("LAP-001", "Gaming Laptop", 50));
        productList.add(new Product("CAM-004", "Webcam HD", 120));

        System.out.println("--- Current Product Stock (Unsorted) ---");
        productList.forEach(product -> System.out.println("SKU: " + product.getSku() + ", Name: " + product.getName()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Product Stock Search (Linear Search) ---");
        System.out.print("Enter the product SKU to find (ex: MON-001): ");
        String skuToFind = scanner.nextLine();

        System.out.println("\nStarting linear search for SKU: " + skuToFind);
        Product foundProduct = LinearSearch.findBySku(productList, skuToFind);

        System.out.println("\n--- Search Result ---");
        if (foundProduct != null) {
            System.out.println("Product Found!");
            System.out.println("  SKU: " + foundProduct.getSku());
            System.out.println("  Name: " + foundProduct.getName());
            System.out.println("  Stock: " + foundProduct.getQuantityInStock() + " units");
        } else {
            System.out.println("Product with SKU '" + skuToFind + "' was not found in the stock.");
        }

        scanner.close();
    }
}


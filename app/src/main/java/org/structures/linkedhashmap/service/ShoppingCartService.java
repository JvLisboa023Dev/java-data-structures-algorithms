package org.structures.linkedhashmap.service;
import org.structures.linkedhashmap.model.Product;

public interface ShoppingCartService {
    void addItem(Product product, int quantity);
    void removeItem(String productId);
    void viewCart();
    double calculateTotal();
}

package org.structures.linkedhashmap.service.impl;

import org.structures.linkedhashmap.model.CartItem;
import org.structures.linkedhashmap.model.Product;
import org.structures.linkedhashmap.service.ShoppingCartService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Locale;

public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final Map<String, CartItem> items;

    public ShoppingCartServiceImpl() {
        this.items = new LinkedHashMap<>();
    }

    @Override
    public void addItem(Product product, int quantity) {
        String productId = product.getId().toLowerCase(Locale.ROOT);

        if (items.containsKey(productId)) {

            CartItem currentItem = items.get(productId);
            currentItem.setQuantity(currentItem.getQuantity() + quantity);
            System.out.println("Updated quantity for " + product.getName() + ".");
        } else {
            items.put(productId, new CartItem(product, quantity));
            System.out.println(product.getName() + " added to the cart.");
        }
    }

    @Override
    public void removeItem(String productId) {
        CartItem removedItem = items.remove(productId.toLowerCase(Locale.ROOT));
        if (removedItem != null) {
            System.out.println(removedItem.getProduct().getName() + " was removed from the cart.");
        } else {
            System.out.println("Product with ID '" + productId + "' not found in the cart.");
        }
    }

    @Override
    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("\nYour shopping cart is empty.");
            return;
        }
        System.out.println("\n--- Your Shopping Cart (Items in order of addition) ---");

        items.values().forEach(item -> {
            Product p = item.getProduct();
            System.out.printf("  - %s (ID: %s) | Quantity: %d | Price: $%.2f | Subtotal: $%.2f%n",
                    p.getName(), p.getId(), item.getQuantity(), p.getPrice(), (item.getQuantity() * p.getPrice()));
        });
        System.out.printf("----------------------------------------------------------%n");
        System.out.printf("  Total: $%.2f%n", calculateTotal());
    }

    @Override
    public double calculateTotal() {
        return items.values().stream()
                .mapToDouble(item -> item.getProduct().getPrice() * item.getQuantity())
                .sum();
    }
}

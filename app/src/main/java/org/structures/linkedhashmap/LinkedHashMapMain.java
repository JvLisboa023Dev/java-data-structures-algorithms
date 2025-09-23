package org.structures.linkedhashmap;

import org.structures.linkedhashmap.model.Product;
import org.structures.linkedhashmap.service.ShoppingCartService;
import org.structures.linkedhashmap.service.impl.ShoppingCartServiceImpl;

import java.util.Scanner;

public class LinkedHashMapMain {

    public static void main(String[] args) {

        Product laptop = new Product("LAP-001", "Gaming Laptop", 1200.50);
        Product mouse = new Product("MSE-002", "Wireless Mouse", 25.00);
        Product keyboard = new Product("KEY-003", "Mechanical Keyboard", 75.75);

        ShoppingCartService cart = new ShoppingCartServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- Online Store Menu (LinkedHashMap) ---");
            System.out.println("1. Add Laptop to Cart");
            System.out.println("2. Add Mouse to Cart");
            System.out.println("3. Add Keyboard to Cart");
            System.out.println("4. Remove an item from Cart");
            System.out.println("5. View Cart");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    cart.addItem(laptop, 1);
                    break;
                case 2:
                    cart.addItem(mouse, 1);
                    break;
                case 3:
                    cart.addItem(keyboard, 1);
                    break;
                case 4:
                    System.out.print("Enter the ID of the product to remove (ex: LAP-001): ");
                    String productIdToRemove = scanner.nextLine();
                    cart.removeItem(productIdToRemove);
                    break;
                case 5:
                    cart.viewCart();
                    break;
                case 6:
                    System.out.println("\nExiting store. Thank you for shopping!");
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again.");
            }
        } while (option != 6);

        scanner.close();
    }
}
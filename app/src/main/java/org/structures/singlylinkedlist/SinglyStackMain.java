package org.structures.singly_linked_list;

import org.structures.singly_linked_list.service.SingleLinkedList;
import org.structures.singly_linked_list.service.impl.SinglyLinkedSingleLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SinglyStackMain {

    public static void main(String[] args) {
        SingleLinkedList stack = new SinglyLinkedSingleLinkedList();
        Scanner keyboard = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Stack Operations (Singly Linked List) ---");
            System.out.println("1. Add element ");
            System.out.println("2. Remove top element ");
            System.out.println("3. View top element");
            System.out.println("4. Display all elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = keyboard.nextInt();
                keyboard.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a number.");
                keyboard.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    String data = keyboard.nextLine();
                    stack.push(data);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    String topElement = stack.peek();
                    if (topElement != null) {
                        System.out.println("------------------------------------");
                        System.out.println("Top element: " + topElement);
                        System.out.println("------------------------------------");
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("------------------------------------");
                    System.out.println("Exiting program...");
                    System.out.println("------------------------------------");
                    keyboard.close();
                    return;
                default:
                    System.out.println("------------------------------------");
                    System.out.println("Invalid option. Please try again.");
                    System.out.println("------------------------------------");
            }
        }
    }
}
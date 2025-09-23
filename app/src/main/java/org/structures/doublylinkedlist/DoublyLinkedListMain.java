package org.structures.doublylinkedlist;

import org.structures.doublylinkedlist.service.DoublyLinkedListService;
import org.structures.doublylinkedlist.service.impl.DoublyLinkedListServiceImpl;
import java.util.Scanner;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedListService list = new DoublyLinkedListServiceImpl("Head");
        Scanner keyboard = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Doubly Linked List Menu ---");
            System.out.println("1. Add Element After Current");
            System.out.println("2. Move to Previous Element");
            System.out.println("3. Move to Next Element");
            System.out.println("4. Display Full List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = keyboard.nextInt();
                keyboard.nextLine(); // Consume newline
            } catch (Exception e) {
                System.out.println("------------------------------------");
                System.out.println("Invalid input.");
                System.out.println("------------------------------------");
                keyboard.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter data for the new element: ");
                    String data = keyboard.nextLine();
                    list.addAfterCurrent(data);
                    break;
                case 2:
                    list.moveToPrevious();
                    break;
                case 3:
                    list.moveToNext();
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("------------------------------------");
                    System.out.println("Exiting...");
                    System.out.println("------------------------------------");
                    return;
                default:
                    System.out.println("------------------------------------");
                    System.out.println("Invalid option. Please try again.");
                    System.out.println("------------------------------------");
            }
        }
    }
}
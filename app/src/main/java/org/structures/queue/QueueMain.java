package org.structures.queue;

import org.structures.queue.model.PrintJob;
import org.structures.queue.service.QueueService;
import org.structures.queue.service.impl.QueueServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        QueueService printQueue = new QueueServiceImpl();
        Scanner keyboard = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Print Job Queue Manager ---");
            System.out.println("1. Add a print job");
            System.out.println("2. Process the next print job");
            System.out.println("3. View the next print job");
            System.out.println("4. Display all print jobs");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = keyboard.nextInt();
                keyboard.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("-----------------------------------------------");
                System.out.println("Error: Invalid input. Please enter a number.");
                System.out.println("-----------------------------------------------");
                keyboard.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the document name to add: ");
                    String documentName = keyboard.nextLine();
                    printQueue.enqueue(new PrintJob(documentName));
                    break;
                case 2:
                    printQueue.dequeue();
                    break;
                case 3:
                    PrintJob nextJob = printQueue.peek();
                    if (nextJob != null) {
                        System.out.println("-----------------------------------------------");
                        System.out.println("Next job to be processed: " + nextJob);
                        System.out.println("-----------------------------------------------");
                    }
                    break;
                case 4:
                    printQueue.display();
                    break;
                case 5:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Shutting down print manager...");
                    System.out.println("-----------------------------------------------");
                    return;
                default:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Invalid option. Please try again.");
                    System.out.println("-----------------------------------------------");
            }
        }
    }
}
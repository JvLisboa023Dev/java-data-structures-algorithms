package org.structures.hashmap;

import org.structures.hashmap.model.Student;
import org.structures.hashmap.service.ListManager;
import org.structures.hashmap.service.impl.ListManagerImpl;

import java.util.Scanner;

public class HashMapMain {

    public static void main(String[] args) {
        // Initial data
        Student[] students = new Student[]{
                new Student(1, "Bill", "Jones", "UNDER-REVIEW"),
                new Student(2, "John", "Smith", "UNDER-REVIEW"),
                new Student(3, "Wally", "Wiggles", "ENROLLED"),
                new Student(4, "May", "Hanks", "UNDER-REVIEW"),
                new Student(5, "Jane", "Carson", "UNDER-REVIEW"),
                new Student(6, "Lori", "Random", "UNDER-REVIEW")
        };

        // Programming to the interface, not the implementation
        ListManager listManager = new ListManagerImpl(students);
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- Student Management Menu (HashMap) ---");
            System.out.println("1. List all students");
            System.out.println("2. Find student by last name");
            System.out.println("3. Update student status");
            System.out.println("4. Remove student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    listManager.listStudents();
                    break;
                case 2:
                    System.out.print("Enter the last name of the student to find: ");
                    String lastNameToFind = scanner.nextLine();
                    listManager.findStudent(lastNameToFind);
                    break;
                case 3:
                    System.out.print("Enter the last name of the student to update: ");
                    String lastNameToUpdate = scanner.nextLine();
                    System.out.print("Enter the new status (e.g., ENROLLED, REJECTED): ");
                    String newStatus = scanner.nextLine();
                    listManager.updateStudentStatus(lastNameToUpdate, newStatus);
                    break;
                case 4:
                    System.out.print("Enter the last name of the student to remove: ");
                    String lastNameToRemove = scanner.nextLine();
                    listManager.removeStudent(lastNameToRemove);
                    break;
                case 5:
                    System.out.println("\nExiting program.");
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again.");
            }
        } while (option != 5);

        scanner.close();
    }
}
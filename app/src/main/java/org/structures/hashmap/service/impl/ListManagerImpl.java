package org.structures.hashmap.service.impl;

import org.structures.hashmap.model.Student;
import org.structures.hashmap.service.ListManager;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ListManagerImpl implements ListManager {
    private final Map<String, Student> studentsMap;

    public ListManagerImpl(Student[] students) {
        this.studentsMap = new HashMap<>();
        for (Student student : students) {
            // The put() method associates the key (lastName) with the value (student).
            this.studentsMap.put(student.getLastName().toLowerCase(Locale.ROOT), student);
        }
    }

    @Override
    public void listStudents() {
        if (studentsMap.isEmpty()) {
            System.out.println("The system has no students on the waiting list.");
        } else {
            System.out.println("\n--- Listing All Students ---");
            studentsMap.values().forEach(System.out::println);
        }
    }

    @Override
    public void findStudent(String lastName) {
        // The get() method returns the value for the key, or null if the key is not found.
        Student student = studentsMap.get(lastName.toLowerCase(Locale.ROOT));

        if (student != null) {
            System.out.println("\n--- Student Found ---");
            System.out.println(student);
        } else {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Student with last name '" + lastName + "' does not exist.");
            System.out.println("--------------------------------------------------------------");
        }
    }

    @Override
    public void updateStudentStatus(String lastName, String newStatus) {

        Student student = studentsMap.get(lastName.toLowerCase(Locale.ROOT));

        if (student != null) {
            String oldStatus = student.getStatus();
            student.setStatus(newStatus);
            System.out.println("\nStudent (" + lastName + ") status was changed from '" + oldStatus.toUpperCase(Locale.ROOT) + "' to '" + newStatus.toUpperCase(Locale.ROOT) + "'.");
        } else {
            System.out.println("\nStudent does not exist. Status was not updated.");
        }
    }

    @Override
    public void removeStudent(String lastName) {
        // The remove() method deletes the key-value pair and returns the removed value.
        Student removedStudent = studentsMap.remove(lastName.toLowerCase(Locale.ROOT));

        if (removedStudent != null) {
            System.out.println("\n--- Student Successfully Removed ---");
            System.out.println(removedStudent);
        } else {
            System.out.println("\nStudent was not found and could not be removed.");
        }
    }
}
package org.structures.hashmap.service;

public interface ListManager {
    void listStudents();
    void findStudent(String lastName);
    void updateStudentStatus(String lastName, String newStatus);
    void removeStudent(String lastName);
}
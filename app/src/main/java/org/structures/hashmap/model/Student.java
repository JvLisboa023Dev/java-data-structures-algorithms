package org.structures.hashmap.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Locale;

@Data
@NoArgsConstructor
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String status; // ENROLLED, UNDER-REVIEW, REJECTED

    public Student(int studentId, String firstName, String lastName, String status) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.setStatus(status);
    }

    public void setStatus(String status) {
        if (status != null) {
            this.status = status.toUpperCase(Locale.ROOT);
        } else {
            this.status = null;
        }
    }
}
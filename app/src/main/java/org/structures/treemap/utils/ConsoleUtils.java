package org.structures.treemap.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public final class ConsoleUtils {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    private ConsoleUtils() {}

    public static LocalDateTime promptForDateTime(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (true) {
            String line = scanner.nextLine();
            try {
                return LocalDateTime.parse(line, FORMATTER);
            } catch (DateTimeParseException e) {
                System.out.print("Invalid format. Please use 'yyyy-MM-dd HH:mm' and try again: ");
            }
        }
    }
}

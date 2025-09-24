package org.structures.treemap;

import org.structures.treemap.service.CalendarService;
import org.structures.treemap.service.impl.CalendarServiceImpl;
import java.time.LocalDateTime;
import java.util.Scanner;
import org.structures.treemap.utils.ConsoleUtils;
import static org.structures.treemap.utils.ConsoleUtils.promptForDateTime;

public class TreeMapMain {
    public static void main(String[] args) {

        CalendarService calendar = new CalendarServiceImpl();
        System.out.println("Seeding initial events...");

        calendar.scheduleEvent(LocalDateTime.now().plusDays(2).withHour(10).withMinute(0), "Project Deadline");
        calendar.scheduleEvent(LocalDateTime.now().plusDays(1).withHour(14).withMinute(30), "Team Meeting");
        calendar.scheduleEvent(LocalDateTime.now().plusDays(2).withHour(9).withMinute(0), "Morning Stand-up");

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- Calendar Menu (TreeMap) ---");
            System.out.println("1. Schedule a new event");
            System.out.println("2. Display all events");
            System.out.println("3. Display next upcoming event");
            System.out.println("4. Cancel an event");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    LocalDateTime dateTime = ConsoleUtils.promptForDateTime(scanner, "Enter event date and time (yyyy-MM-dd HH:mm): ");
                    System.out.print("Enter event description: ");
                    String description = scanner.nextLine();
                    calendar.scheduleEvent(dateTime, description);
                    break;
                }
                case 2:
                    calendar.displayAllEvents();
                    break;
                case 3:
                    calendar.displayNextEvent();
                    break;
                case 4: {
                    LocalDateTime dateTimeToCancel = promptForDateTime(scanner, "Enter date and time of the event to cancel (yyyy-MM-dd HH:mm): ");
                    calendar.cancelEvent(dateTimeToCancel);
                    break;
                }
                case 5:
                    System.out.println("\nExiting calendar.");
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again.");
            }
        } while (option != 5);

        scanner.close();
    }
}

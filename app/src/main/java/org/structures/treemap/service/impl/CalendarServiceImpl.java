package org.structures.treemap.service.impl;

import org.structures.treemap.model.Event;
import org.structures.treemap.service.CalendarService;

import java.time.temporal.ChronoUnit;
import java.util.TreeMap;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.NavigableMap;


public class CalendarServiceImpl implements CalendarService {

    private final NavigableMap<LocalDateTime, Event> events;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public CalendarServiceImpl() {
        this.events = new TreeMap<>();
    }

    @Override
    public void scheduleEvent(LocalDateTime dateTime, String description) {
        LocalDateTime key = dateTime.truncatedTo(ChronoUnit.MINUTES);
        if (events.containsKey(key)) {
            System.out.println("Error: An event is already scheduled at this time. Please choose another time.");
            return;
        }
        events.put(key, new Event(description));
        System.out.println("Event '" + description + "' scheduled for " + dateTime.format(formatter));
    }

    @Override
    public void cancelEvent(LocalDateTime dateTime) {

        LocalDateTime key = dateTime.truncatedTo(ChronoUnit.MINUTES);
        Event removedEvent = events.remove(key);
        if (removedEvent != null) {
            System.out.println("Successfully canceled event: " + removedEvent.getDescription());
        } else {
            System.out.println("Error: No event found at the specified time to cancel.");
        }
    }

    @Override
    public void displayNextEvent() {
        LocalDateTime now = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        // i'm using ceilingEntry() because he's powerful TreeMap method.
        Map.Entry<LocalDateTime, Event> nextEventEntry = events.ceilingEntry(now);

        System.out.println("\n--- Next Upcoming Event ---");
        if (nextEventEntry == null) {
            System.out.println("No upcoming events scheduled.");
        } else {
            System.out.println("At " + nextEventEntry.getKey().format(formatter) + ": " + nextEventEntry.getValue().getDescription());
        }
    }

    @Override
    public void displayAllEvents() {
        if (events.isEmpty()) {
            System.out.println("\nYour calendar is empty.");
            return;
        }
        System.out.println("\n--- All Scheduled Events (Chronological Order) ---");
        events.forEach((dateTime, event) -> {
            System.out.println("At " + dateTime.format(formatter) + " --> " + event.getDescription());
        });
    }
}

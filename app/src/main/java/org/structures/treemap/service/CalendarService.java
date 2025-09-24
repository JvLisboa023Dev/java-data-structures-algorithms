package org.structures.treemap.service;

import java.time.LocalDateTime;

public interface CalendarService {
    void scheduleEvent(LocalDateTime dateTime, String description);
    void cancelEvent(LocalDateTime dateTime);
    void displayNextEvent();
    void displayAllEvents();
}

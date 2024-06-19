package Old.org.Classwork03_05_24Sum.event;

import java.time.LocalDateTime;

public class Event implements Comparable<Event> {
    private LocalDateTime dateTime;
    private String description;

    public Event(LocalDateTime dateTime, String description) {
        this.dateTime = dateTime;
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Event{" +
                "dateTime=" + dateTime +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Event o) {
        int result = this.dateTime.compareTo(o.dateTime);
        if (result == 0) result = this.description.compareTo(o.description);
        return result;
    }
}

import java.util.Objects;

public class Event {
    private String name;
    private String date;
    private String venue;

    public Event(String name, String date, String venue) {
        this.name = name;
        this.date = date;
        this.venue = venue;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Event: " + name + ", Date: " + date + ", Venue: " + venue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Event event = (Event) obj;
        return Objects.equals(name, event.name) &&
                Objects.equals(date, event.date) &&
                Objects.equals(venue, event.venue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, venue);
    }
}

// Subclasses
class GameEvent extends Event {
    public GameEvent(String name, String date, String venue) {
        super(name, date, venue);
    }
}

class TrainingEvent extends Event {
    public TrainingEvent(String name, String date, String venue) {
        super(name, date, venue);
    }
}

class FanEvent extends Event {
    public FanEvent(String name, String date, String venue) {
        super(name, date, venue);
    }
}

class PressConference extends Event {
    public PressConference(String name, String date, String venue) {
        super(name, date, venue);
    }
}

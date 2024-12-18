// Event.java
public class Event {
    private String name;
    private String date;
    private Organizer organizer;

    public Event(String name, String date, Organizer organizer) {
        this.name = name;
        this.date = date;
        this.organizer = organizer;
    }

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

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    @Override
    public String toString() {
        return "Event: " + name + ", Date: " + date + ", Organized by: " + organizer.getName();
    }
}

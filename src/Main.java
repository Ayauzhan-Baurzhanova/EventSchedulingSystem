import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Create Events
        List<Event> events = new ArrayList<>();
        events.add(new GameEvent("49ers vs Seahawks", "2024-01-15", "Levi's Stadium"));
        events.add(new TrainingEvent("Spring Training", "2024-02-01", "Practice Facility"));
        events.add(new FanEvent("Autograph Signing", "2024-03-10", "Fan Zone"));
        events.add(new PressConference("Season Kickoff", "2024-04-01", "Media Room"));

        // Create Participants (objects)
        List<Participant> participants = new ArrayList<>();
        participants.add(new Player("Jimmy Garoppolo", 31));
        participants.add(new Coach("Kyle Shanahan", 43));
        participants.add(new Referee("Sarah Thomas", 35));
        participants.add(new MediaPersonnel("John Doe", 45));
        participants.add(new Sponsor("PepsiCo", 100));
        participants.add(new VIP("Jerry Rice", 60));

        // 1. Search Events by Name
        System.out.println("Search Events by Name: 'Spring Training'");
        List<Event> searchedEvents = searchEventsByName(events, "Spring Training");
        searchedEvents.forEach(event -> System.out.println(event));

        // 2. Filter Events by Type
        System.out.println("\nFilter Events by Type: GameEvent");
        List<GameEvent> gameEvents = filterEventsByType(events, GameEvent.class);
        gameEvents.forEach(gameEvent -> System.out.println(gameEvent));

        // 3. Sort Events by Date
        System.out.println("\nSort Events by Date:");
        List<Event> sortedEvents = sortEventsByDate(events);
        sortedEvents.forEach(sortedEvent -> System.out.println(sortedEvent));

        // 4. Filter Participants by Type
        System.out.println("\nFilter Participants by Type: Player");
        List<Player> players = filterParticipantsByType(participants, Player.class);
        players.forEach(player -> System.out.println(player));
    }

    // Search events by name
    public static List<Event> searchEventsByName(List<Event> events, String name) {
        return events.stream()
                .filter(event -> event.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    // Filter events by type
    public static <T extends Event> List<T> filterEventsByType(List<? extends Event> events, Class<T> type) {
        return events.stream()
                .filter(type::isInstance)
                .map(type::cast)
                .collect(Collectors.toList());
    }

    // Sort events by date
    public static List<Event> sortEventsByDate(List<Event> events) {
        return events.stream()
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());
    }

    // Filter participants by type
    public static <T extends Participant> List<T> filterParticipantsByType(List<? extends Participant> participants, Class<T> type) {
        return participants.stream()
                .filter(type::isInstance)
                .map(type::cast)
                .collect(Collectors.toList());
    }
}




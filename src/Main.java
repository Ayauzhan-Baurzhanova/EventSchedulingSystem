// Main.java
public class Main {
    public static void main(String[] args) {
        Organizer organizer = new Organizer("Alice Johnson", "alice@example.com");
        Event event = new Event("Tech Conference", "2024-12-20", organizer);

        Participant participant1 = new Participant("John Doe", 30);
        Participant participant2 = new Participant("Jane Smith", 25);

        System.out.println(event);
        System.out.println(participant1);
        System.out.println(participant2);

        System.out.println("Comparing participants:");
        System.out.println(participant1.getName().equals(participant2.getName())
                ? "Participants are the same"
                : "Participants are different");
    }
}

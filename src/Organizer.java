public class Organizer {
    private String name;
    private String role;

    public Organizer(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Organizer: " + name + ", Role: " + role;
    }
}

// Subclasses
class TeamStaff extends Organizer {
    public TeamStaff(String name, String role) {
        super(name, role);
    }
}

class ExternalOrganizer extends Organizer {
    public ExternalOrganizer(String name, String role) {
        super(name, role);
    }
}



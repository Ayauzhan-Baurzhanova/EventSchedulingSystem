// Organizer.java
public class Organizer {
    private String name;
    private String contactInfo;

    public Organizer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Organizer: " + name + ", Contact: " + contactInfo;
    }
}


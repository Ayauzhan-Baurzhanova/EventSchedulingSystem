public class Participant {
    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Participant: " + name + ", Age: " + age;
    }
}

// Subclasses
class Coach extends Participant {
    public Coach(String name, int age) {
        super(name, age);
    }
}

class Player extends Participant {
    public Player(String name, int age) {
        super(name, age);
    }
}

class Referee extends Participant {
    public Referee(String name, int age) {
        super(name, age);
    }
}

class MediaPersonnel extends Participant {
    public MediaPersonnel(String name, int age) {
        super(name, age);
    }
}

class Sponsor extends Participant {
    public Sponsor(String name, int age) {
        super(name, age);
    }
}

class VIP extends Participant {
    public VIP(String name, int age) {
        super(name, age);
    }
}

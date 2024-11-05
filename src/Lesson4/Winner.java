package Lesson4;

public class Winner {
    private String name;
    private String surname;
    private double milesRan;

    public Winner(String name, String surname, double milesRan) {
        this.name = name;
        this.surname = surname;
        this.milesRan = milesRan;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getMilesRan() {
        return milesRan;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return name + ", " + surname + ", " + milesRan;
    }
    //create a winner determination function
    public static Winner determineWinner(Member[] members, int count) {
        double maxMiles = 0;
        Winner winner = null;

        for (int i = 0; i < count; i++) {
            if (members[i].getMiles() > maxMiles) {
                maxMiles = members[i].getMiles();
                winner = new Winner(members[i].getName(), members[i].getSurname(), members[i].getMiles());
            }
        }

        return winner;
    }
}

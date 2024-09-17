package Lesson2;

public class Animal {
    private String animalname;

    public Animal(String animalname) {
        this.animalname = animalname;
    }

    public String getAnimalname() {
        return animalname;
    }

    public void setAnimalname(String animalname) {
        this.animalname = animalname;
    }

    public void sound() {
        System.out.println("The animal : " + animalname + " has no sound");
    }


}

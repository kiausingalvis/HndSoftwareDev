package Lesson2;

public class Dog extends Animal{
    public Dog(String animalname){
        super(animalname);

    }

    private void Bark(){
        System.out.println("The dog: " + getAnimalname() + " bark");
    }

    @Override
    public void sound() {
        Bark();
    }
}

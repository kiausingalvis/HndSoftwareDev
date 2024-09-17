package Lesson2;

public class Main {
    public static void main(String[] args) {
        Person Person1 = new Person("Gaidys", 42, "Female");
        Student Student1 = new Student("Ahmed", 21, "Male", "214", 172468.22222, 5);
        Teacher Teacher1 = new Teacher("Paul", 29, "Male", "12", 123512.2);
        Animal Dog1 = new Animal("dog");
        Dog Dog2 = new Dog("dog");

        FulltimeStudent student1 = new FulltimeStudent("gaidys", 21, "male", "11", 21, 20);
        ParttimeStudent student2 = new ParttimeStudent("gaidys", 21, "male", "11", 21, 20);
        System.out.println(student1.FulltimeFee());
        System.out.println(student2.ParttimeFee());
    }

}

package Lesson2;

import java.sql.SQLOutput;

public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void PersonInfo()
    {
        System.out.println("The name is: " + name + ", age is: " + age + ", the gender is: " + gender);
    }
}

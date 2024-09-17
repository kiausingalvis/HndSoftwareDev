package Lesson2;

public class Teacher extends Person{
    String teacherID;
    double salary;

    public Teacher(String name, int age, String gender, String teacherID, double salary){
        super(name, age, gender);
        this.teacherID = teacherID;
        this.salary = salary;


    }
    public void teacherInfo(){
        System.out.println("Teacher Id: " + teacherID + " Salary: " + salary);
    }
}

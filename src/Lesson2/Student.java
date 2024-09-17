package Lesson2;

public class Student extends Person{
    String stuId;
    double fee;
    int hoursAttended;

    public Student(String name, int age, String gender, String stuId, double fee, int hoursAttended){
        super(name, age, gender);
        this.stuId = stuId;
        this.fee = fee;
        this.hoursAttended = hoursAttended;
    }
    public void StudentInfo()
    {
        System.out.println("Student Id: "+ stuId + " fee: " + fee);
    }

}

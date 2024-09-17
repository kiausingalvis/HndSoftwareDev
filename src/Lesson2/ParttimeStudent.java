package Lesson2;

public class ParttimeStudent extends Student{ //im not sure if i did this right, dont understand if im supposed to use abstract for student since it would break a lot of earlier tasks
    private double ParttimeFee = 5;

    public ParttimeStudent(String name, int age, String gender, String stuId, double fee, int hoursAttended){
        super(name, age, gender, stuId, fee, hoursAttended);
    }

    public double ParttimeFee(){
        return ParttimeFee * hoursAttended;
    }

}

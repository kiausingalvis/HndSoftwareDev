package Lesson2;

public class FulltimeStudent extends Student{
    private double FulltimeFee = 10;

    public FulltimeStudent(String name, int age, String gender, String stuId, double fee, int hoursAttended){
        super(name, age, gender, stuId, fee, hoursAttended);
    }

    public double FulltimeFee(){
        return hoursAttended * FulltimeFee;
    }

}

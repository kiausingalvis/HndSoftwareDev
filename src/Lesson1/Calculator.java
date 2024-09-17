package Lesson1;

public class Calculator {
    private int Num1;
    private int Num2;

    public Calculator(int Num1, int Num2){
        super();
        this.Num1 = Num1;
        this.Num2 = Num2;
    }

    public int add(int num1, int num2){
        return num1+num2;
    }

    public int minus(int num1, int num2){
        return num1-num2;
    }

    public int divide(int num1, int num2){
        return num1/num2;
    }

    public int multiply(int num1, int num2){
        return num1*num2;
    }
}

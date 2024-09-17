public class Test {
    public int Number1 = 12;
    private int Number2 = 2;

    //constructors should be public and should be the name of the class
    public Test(int num1, int num2){
        this.Number1 = num1; //refers to current object
        this.Number2 = num2; //refers to current object
    }

    public void getNumber2(int num2) {
        this.Number2 = num2;
    }

    public int getNumber2() {
        return Number2;
    }

    public int setNum2(int num2){
        this.Number2=num2;
        return num2;
    }

}
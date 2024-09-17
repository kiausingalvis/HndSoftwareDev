package Lesson1;

public class Shapes {
    private String Shape;

    public Shapes(String Shape){
        super();
        this.Shape = Shape;
        Shape.toUpperCase();
    }

    public String getShapeArea(int Length, int Width){
        if(Shape.equals("RECTANGLE")){
            return String.valueOf(Length*Width)+"m²";
        }else if(Shape.equals("SQUARE")){
            return String.valueOf(Length*2)+"m²";
        }else return "-1"; //if doesn't find any shape
    }

    public int getShapeDiameter(int Length, int Width){
        if(Shape.equals("RECTANGLE")){
            return (int) Math.sqrt((Length*2)+(Width*2));
        }else if(Shape.equals("SQUARE")){
            return (int) Math.sqrt(2) * Length;
        }else return -1;
    }
}

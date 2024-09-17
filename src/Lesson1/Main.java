package Lesson1;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Shapes rect = new Shapes("RECTANGLE");
        System.out.println(rect.getShapeArea(7,2));
        System.out.println(rect.getShapeDiameter(8,2));

        Shapes rect1 = new Shapes("SQUARE");
        System.out.println(rect1.getShapeArea(3,2));
        System.out.println(rect1.getShapeDiameter(2,2));


        Calculator calc1 = new Calculator(2,2);
        System.out.println(calc1.multiply(2,4));
        System.out.println(calc1.add(2,4));
        System.out.println(calc1.divide(2,4));
        System.out.println(calc1.minus(2,4));
    }
}

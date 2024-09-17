public class Circle {
    private int radius;
    private float area;
    private float perimeter;

    public Circle(int radius){
        super();
        this.radius = radius;
    }

    public float getArea(int radius){
        return (float) Math.PI*(radius*2);
    }
    public float getArea(){
        return (float) Math.PI*(radius*2);
    }

    public float getPerimeter(int radius){
        return (float)((float) 2*Math.PI*radius);
    }

    public float getPerimeter(){
        return (float)((float) 2*Math.PI*radius);
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}

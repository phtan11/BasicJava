package lab7.bai2;

public class Circle implements GeometricObject {
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getPerimeter(){
        return 3.14*this.radius*2;
    }
    @Override
    public double getArea(){
        return 3.14*Math.pow(this.radius,2);
    }
    @Override
    public String toString(){
        return "Circle[" + this.radius + "," + getPerimeter() + "," + getArea() + "]";
    }
}

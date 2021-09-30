package lab6.bai4;
class Circle extends Shape{
    private double radius; // ban kinh
    public Circle(){
        super();
        this.radius = 1.0;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double width){
        this.radius = width;
    }
    public double getArea(){
        return 3.14*Math.pow(getRadius(),2);
    }
    public double getPerimeter(){
        return 2*3.14*getRadius();
    }
    @Override
    public String toString(){
        return "Circle[" + getRadius() + "," + getColor() + "," + isFilled() + "," + getArea() + "," + getPerimeter()+"]";
    }
}
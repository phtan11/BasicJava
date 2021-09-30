package java.lab.lab6.bai1;

class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        this.height = 1.0;
    }
    public Cylinder(double radius){
        super(radius);
        this.height = 1.0;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height,String color){
        super(radius,color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return 3.14*getHeight()*Math.pow(getRadius(),2);
    }
    @Override
    public String toString(){
        return "Cylinder[" + getHeight() + "," + getVolume()+"," + getRadius() +"," + getColor() + "," + getArea() + "]";
    }
}

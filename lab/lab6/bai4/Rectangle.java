package lab6.bai4;
class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width,double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return getWidth()*getLength();
    }
    public double getPerimeter(){
        return (getWidth()+getLength())*2;
    }
    @Override
    public String toString(){
        return "Rectangle[" + getWidth() + "," + getLength() + "," + getColor() + "," + isFilled()+"," + getArea() + "," + getPerimeter()+"]";
    }
}

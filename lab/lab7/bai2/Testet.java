package lab7.bai2;

public class Testet {
    public static void main(String[] args){
        GeometricObject n1 = new Circle(10.0);
        System.out.println(n1);
        System.out.println("Perimeter = " + n1.getPerimeter());
        System.out.println("Area = " + n1.getArea());
        System.out.println();
        Resizable n2 = new ResizableCircle(2);
        System.out.println(n2);
    }
}

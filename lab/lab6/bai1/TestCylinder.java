package java.lab.lab6.bai1;

public class TestCylinder {
    public static void main (String[] args){
        Cylinder nCy1 = new Cylinder();
        System.out.println(nCy1);
        Cylinder nCy2 = new Cylinder(4.0);
        System.out.println(nCy2);
        Cylinder nCy3 = new Cylinder(2.0,4.1);
        System.out.println(nCy3);
        Cylinder nCy4 = new Cylinder(1.2,2.1,"pink");
        System.out.println(nCy4);
        System.out.println();
        Circle nCir1 = new Circle();
        System.out.println(nCir1);
        Circle nCir2 = new Circle(1.2);
        System.out.println(nCir2);
        Circle nCir3 = new Circle(5.1,"purple");
        System.out.println(nCir3);
    }
}

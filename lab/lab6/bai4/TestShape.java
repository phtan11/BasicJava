package lab6.bai4;
public class TestShape{
    public static void main(String[] args) {
        Rectangle nRec1 = new Rectangle();
        System.out.println(nRec1);
        Rectangle nRec2 = new Rectangle(2.0,5.0);
        System.out.println(nRec2);
        Rectangle nRec3 = new Rectangle(3.0,4.0,"pink",false);
        System.out.println(nRec3);

        System.out.println();
        Square nsq1 = new Square();
        System.out.println(nsq1);
        Square nsq2 = new Square(2.0);
        System.out.println(nsq2);
        Square nsq3 = new Square(3.0,"purpol",true);
        System.out.println(nsq3);
    }
}
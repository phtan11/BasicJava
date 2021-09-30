package bai2;
import java.util.ArrayList;

public class Program{
    public static ArrayList<Point> filter(ArrayList<Point> list){
        ArrayList<Point> newList = new ArrayList<Point>();
        double distance = 0.0;
        for(Point x : list){
            distance = Math.sqrt(x.getX()*x.getX() + x.getY()*x.getY());
            if(distance <= 1){
                newList.add(x);
            }
        }
        return newList;
    }
    public static void display(ArrayList<Point> list){
        for(Point x: list){
            System.out.println(x);
        }
    }
    public static void main(String[] args){
        ArrayList<Point> P1 = new ArrayList<Point>();
        P1.add(new Point(1,0));
        P1.add(new Point(1,2));
        P1.add(new Point(0,1));
        P1.add(new Point(2,4));
        P1.add(new Point(3,0));
        P1.add(new Point(2,1));
        display(P1);
        System.out.println("after :");
        ArrayList<Point> Fil = filter(P1);
        display(Fil);
    }
}